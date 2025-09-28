package com.tap.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tap.connector.connector_factory;
import com.tap.dao.CartDAO;
import com.tap.model.Cart;

public class CartDAOImpl implements CartDAO {
    private Connection con;

    public CartDAOImpl() {
        try {
            con = connector_factory.requestConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Add item to cart
    @Override
    public void addToCart(Cart cart) {
        try {
            // check if item already exists for this user
            String checkSql = "SELECT cart_id, quantity FROM cart WHERE id=? AND menu_id=?";
            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setInt(1, cart.getId());       // user id
            checkPs.setInt(2, cart.getMenu_id());  // menu id
            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {
                // item already exists → update quantity
                int existingCartId = rs.getInt("cart_id");
                int currentQty = rs.getInt("quantity");
                updateQuantity(existingCartId, currentQty + 1);
            } else {
                // insert new row
                String sql = "INSERT INTO cart (id, rest_id, menu_id, item_name, item_price, item_image, quantity) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, cart.getId());          // user id
                ps.setInt(2, cart.getRest_id());     // restaurant id
                ps.setInt(3, cart.getMenu_id());     // menu id
                ps.setString(4, cart.getItem_name());
                ps.setInt(5, cart.getItem_price());
                ps.setString(6, cart.getItem_image());
                ps.setInt(7, cart.getQuantity());
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Get all cart items for a user
    @Override
    public List<Cart> getCartItems(int id) {
        List<Cart> cartItems = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cart WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cart c = new Cart();
                c.setCart_id(rs.getInt("cart_id"));
                c.setId(rs.getInt("id"));             // user id
                c.setRest_id(rs.getInt("rest_id"));   // restaurant id
                c.setMenu_id(rs.getInt("menu_id"));   // menu id
                c.setItem_name(rs.getString("item_name"));
                c.setItem_price(rs.getInt("item_price"));
                c.setItem_image(rs.getString("item_image"));
                c.setQuantity(rs.getInt("quantity"));
                cartItems.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartItems;
    }

    // ✅ Update quantity of an item
    @Override
    public void updateQuantity(int cart_id, int quantity) {
        try {
            if (quantity > 0) {
                String sql = "UPDATE cart SET quantity=? WHERE cart_id=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, quantity);
                ps.setInt(2, cart_id);
                ps.executeUpdate();
            } else {
                removeItem(cart_id); // delete if quantity <= 0
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Remove one item from cart
    @Override
    public void removeItem(int cart_id) {
        try {
            String sql = "DELETE FROM cart WHERE cart_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cart_id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Clear all items for a user
    @Override
    public void clearCart(int id) {
        try {
            String sql = "DELETE FROM cart WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
