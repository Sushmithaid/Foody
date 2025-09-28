<%@ page import="java.util.List,com.tap.model.Cart,com.tap.dao.CartDAO,com.tap.daoImpl.CartDAOImpl" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    int userId = (int) session.getAttribute("userId"); // session user id
    CartDAO cartDAO = new CartDAOImpl();
    List<Cart> cartItems = cartDAO.getCartItems(userId);

    int subtotal = 0;
    for (Cart item : cartItems) {
        subtotal += item.getItem_price() * item.getQuantity(); // item price * quantity
    }
    int shipping = subtotal > 0 ? 50 : 0; // shipping only if cart is not empty
    int total = subtotal + shipping;
%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Shopping Cart</title>
    <link rel="stylesheet" href="cart.css">
</head>
<body>
    <div class="cart-container">
        <h1>Shopping Cart</h1>
        
        <div class="cart-items">
          <%
            if (cartItems != null && !cartItems.isEmpty()) {
                for (Cart item : cartItems) {
          %>
            <div class="cart-item">
              <img src="<%= item.getItem_image() %>" alt="<%= item.getItem_name() %>" class="item-image">
              <div class="item-details">
                <h3><%= item.getItem_name() %></h3>
                <p class="item-price">₹<%= item.getItem_price() %></p>
                <div class="quantity-controls">

                  <!-- Minus button -->
                  <form action="Carttt" method="post" style="display:inline;">
                      <input type="hidden" name="action" value="update">
                      <input type="hidden" name="cartId" value="<%= item.getCart_id() %>">
                      <input type="hidden" name="quantity" value="<%= item.getQuantity() - 1 %>">
                      <button type="submit" class="quantity-btn">-</button>
                  </form>

                  <span class="quantity"><%= item.getQuantity() %></span>

                  <!-- Plus button -->
                  <form action="Carttt" method="post" style="display:inline;">
                      <input type="hidden" name="action" value="update">
                      <input type="hidden" name="cartId" value="<%= item.getCart_id() %>">
                      <input type="hidden" name="quantity" value="<%= item.getQuantity() + 1 %>">
                      <button type="submit" class="quantity-btn">+</button>
                  </form>

                </div>
              </div>

              <!-- Remove button -->
              <form action="Carttt" method="post">
                  <input type="hidden" name="action" value="remove">
                  <input type="hidden" name="cartId" value="<%= item.getCart_id() %>">
                  <button type="submit" class="remove-btn">×</button>
              </form>
            </div>
          <%
                }
            } else {
          %>
            <p>Your cart is empty.</p>
          <%
            }
          %>
        </div>

        <div class="cart-summary">
          <div class="summary-row">
            <span>Subtotal</span>
            <span>₹<%= subtotal %></span>
          </div>
          <div class="summary-row">
            <span>Shipping</span>
            <span>₹<%= shipping %></span>
          </div>
          <div class="summary-row total">
            <span>Total</span>
            <span>₹<%= total %></span>
          </div>

          <!-- Clear Cart -->
          <form action="Carttt" method="post">
              <input type="hidden" name="action" value="clear">
              <button type="submit" class="checkout-btn">Clear Cart</button>
          </form>

<form action="submit.jsp" method="post">
  <button type="submit" class="checkout-btn">Proceed to Checkout</button>
</form>
        </div>
    </div>
</body>
</html>
