<%@ page import="java.util.List,com.tap.model.Restaurant,
				com.tap.dao.RestaurantDAO,com.tap.daoImpl.RestaurantDAOImpl" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  

    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Restaurant Listings</title>
    <link rel="stylesheet" href="rest.css">
  </head>
  <body>
    <div class="container">
    <h1 style="
  font-family: 'Playfair Display', serif;
  font-size: 4rem;
  font-weight: 700;
  background: linear-gradient(135deg, #f59e0b 0%, #ea580c 50%, #dc2626 100%);
  background-clip: text;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  text-shadow: 0 4px 8px rgba(245, 158, 11, 0.3);
  letter-spacing: -0.02em;
  line-height: 1.1;
  margin: 0;
  position: relative;
  transition: all 0.3s ease;
  text-align: center;
  margin-bottom: 2.5rem">      Featured Restaurants     </h1>
      <div class="restaurant-grid">
      
      
      <%
      RestaurantDAOImpl resto=new RestaurantDAOImpl();
      List<Restaurant> res=resto.getAllRestaurentDetails();
      	 for(Restaurant r : res)
	     {
	    	
      %> 
         
        <!-- Restaurant 1 -->
        <a href="menuuss?restaurantId=<%= r.getRest_id() %>">
        <div class="restaurant-card">
          <div class="restaurant-image">
            
	            <img src=<%= r.getImagePath() %> alt="Restaurant 1">
	            <span class="status active"><%= r.getIsActive() %></span>
	      </div>
	           <div class="restaurant-info">
	           <h2 style="font-weight:normal; color: brown"><%= r.getName()%></h2>
	           <h4 style="color: black;font-weight:normal" class="address">📍 <%= r.getAddress() %></h4>
	           <p style="color: black; font-style:italic">🍽️ <%= r.getCusineType() %></p>
	            <div class="rating">★★★★☆ <%= r.getRating()%></div>
	            <p style="font-size:16px" class="phone">📞 <%= r.getPhone() %></p>
	            
	            <p class="eta">⏳ <%= r.getEta() %> mins</p>
	           </div>
         </div>
         </a>
        
        <%
	    	}
        %>

        
    </div>
  </body>
</html>