<%@page import="com.tap.daoImpl.MenuDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List,com.tap.model.Menu" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delicious Food Menu</title>
    <link rel="stylesheet" href="menuuuu.css">
    <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;700;900&family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
</head>
<body>
    <div class="container">
        <header class="menu-header">
            <h1 class="menu-title">Our Delicious Menu</h1>
            <p class="menu-subtitle">Crafted with love, served with passion</p>
        </header>

        <div class="menu-grid">
        
        
            <!-- Menu Item 1 -->
            
            <%
        List<Menu> menuList = (List<Menu>)request.getAttribute("menus");
        if (menuList != null && !menuList.isEmpty()) 
        {
            for (Menu m : menuList) 
            {
               
        
        %>        
      
            <div class="menu-item">
                <div class="item-image">
                    <img src=<%= m.getImagePath() %> alt="Grilled Salmon">
                    
                </div>
                <div class="item-content">
                    <h3 class="item-name"><%= m.getItemName() %></h3>
                    <p class="item-description"></p>
                    <div class="item-rating">
                        <div class="stars">★★★★★</div>
                        <span class="rating-text"><%= m.getRating()%></span>
                    </div>
                    <div class="item-footer">
                        <span class="item-price">₹<%= m.getPrice()%></span>
                        
                        
                        
<form action="Carttt" method="post">
    <input type="hidden" name="action" value="add">
    <input type="hidden" name="restaurantId" value="<%= request.getParameter("restaurantId") %>">
    <input type="hidden" name="menuId" value="<%= m.getMenu_id() %>">
    <input type="hidden" name="itemName" value="<%= m.getItemName() %>">
    <input type="hidden" name="itemPrice" value="<%= m.getPrice() %>">
    <input type="hidden" name="itemImage" value="<%= m.getImagePath() %>">
    <button class="add-to-cart-btn" onclick="alert('✅ Item added to cart!')">Add to Cart</button>
</form>

                        
                    </div>
                </div>
            </div>


<%
            }
        } 
        
        else {
         %>
         <p style="text-align:center; color:red;">No menu items available for this restaurant.</p>

		<%
          }
        %>
 
         </div>
    </div>
</body>
</html>