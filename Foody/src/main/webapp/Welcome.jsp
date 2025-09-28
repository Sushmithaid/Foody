<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
   
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Welcome.css">
    <title>QuickBite - Healthy Diet Everyday</title>
</head>
<body>
    <div class="wrapper">
    
        <!-- Hero Section -->
        <section class="hero">
            <header>
                <nav class="navbar">
                    <div class="logo" style="color: orangered;">QuickBite</div>
                    <ul class="nav-links">
                        <li><a href="restaurant.jsp">Restaurants</a></li>
                        <li><a href="#categories">Categories</a></li>
                        <li><a href="Carttt.jsp">Cart</a></li>
                     </ul>
                </nav>
            </header>

            <div class="hero-section">
                <div class="hero-content">
                    <h1 style="color: orangered;">Delicious Food<br>Everyday</h1>
                    <p>order today and receive your<br>package tomorrow</p>
                    <div class="hero-buttons">
                    
                    <a href="restaurant.jsp">
                        <button class="btn primary">Restaurants</button>
                    </a>
                        
                    </div>
                    <div class="time-slot">
                        <h3>Ordering Hours</h3>
                        <p>7:00 am - 11:30 pm</p>
                    </div>
                </div>
                <div class="hero-image">
                    <img src="https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg?auto=compress&cs=tinysrgb&w=500" alt="Pasta dish with tomatoes and basil">
                </div>
            </div>
        </section>

        <!-- Categories Section -->
        <section class="categories" id="categories">
            <h2>Food Categories</h2>
            <div class="container">
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?w=300&h=200&fit=crop" alt="Biryani">
                    </div>
                    <p>Biryani</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1630383249896-424e482df921?w=300&h=200&fit=crop" alt="South Indian">
                    </div>
                    <p>South Indian</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1585937421612-70a008356fbe?w=300&h=200&fit=crop" alt="North Indian">
                    </div>
                    <p>North Indian</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=300&h=200&fit=crop" alt="Burger">
                    </div>
                    <p>Burger</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1501443762994-82bd5dace89a?w=300&h=200&fit=crop" alt="Ice-Cream">
                    </div>
                    <p>Ice-Cream</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1513104890138-7c749659a591?w=300&h=200&fit=crop" alt="Pizza">
                    </div>
                    <p>Pizza</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=300&h=200&fit=crop" alt="Cake">
                    </div>
                    <p>Cake</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1626700051175-6818013e1d4f?w=300&h=200&fit=crop" alt="Rolls">
                    </div>
                    <p>Rolls</p>
                </div>
                
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1589301760014-d929f3979dbc?w=300&h=200&fit=crop" alt="Dosa">
                    </div>
                    <p>Dosa</p>
                </div>
                <div class="item">
                    <div class="image-container">
                        <img src="https://images.unsplash.com/photo-1585032226651-759b368d7246?w=300&h=200&fit=crop" alt="Chinese">
                    </div>
                    <p>Chinese</p>
                </div>
            </div>
        </section>
    </div>
</body>
</html>