package com.tap.servlet;

import java.io.IOException;

import com.tap.dao.CartDAO;
import com.tap.daoImpl.CartDAOImpl;
import com.tap.model.Cart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Carttt")
public class CartServlet extends HttpServlet 
{
    private CartDAO cartDAO;

    @Override
    public void init() throws ServletException 
    {
        cartDAO = new CartDAOImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {

        String action = request.getParameter("action");
        int userId = (int) request.getSession().getAttribute("userId"); // assuming session stores userId

        switch (action) 
        {
            case "add":
                int menuId = Integer.parseInt(request.getParameter("menuId"));
                String itemName = request.getParameter("itemName");
                int itemPrice = Integer.parseInt(request.getParameter("itemPrice"));
                String itemImage = request.getParameter("itemImage");
                int restaurantId = Integer.parseInt(request.getParameter("restaurantId"));

                Cart cart = new Cart();
                cart.setId(userId);
                cart.setMenu_id(menuId);
                cart.setRest_id(restaurantId);
                cart.setItem_name(itemName);
                cart.setItem_price(itemPrice);
                cart.setItem_image(itemImage);
                cart.setQuantity(1);

                cartDAO.addToCart(cart);
                break;

            case "update":
                int cartId = Integer.parseInt(request.getParameter("cartId"));
                int quantity = Integer.parseInt(request.getParameter("quantity"));
                cartDAO.updateQuantity(cartId, quantity);
                break;

            case "remove":
                int removeId = Integer.parseInt(request.getParameter("cartId"));
                cartDAO.removeItem(removeId);
                break;

            case "clear":
                cartDAO.clearCart(userId);
                break;
        }

        response.sendRedirect("Carttt.jsp"); // redirect back to cart page
    }
}
