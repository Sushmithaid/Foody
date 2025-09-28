<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>QuickBite - Food Delivery Made Easy</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <!-- Navigation -->
    <nav class="navbar">
        <div class="nav-container">
            <div class="nav-logo">
                <h2>🍀🍴 QuickBite</h2>
            </div>
            <div class="nav-links">
                <a href="signup.jsp" class="btn-secondary">Sign Up</a>
                <a href="login.jsp" class="btn-primary">Log In</a>
            </div>
        </div>
    </nav>

    <!-- Hero Section -->
    <section class="hero">
        <div class="hero-content">
            <div class="hero-text">
                <h1>Delicious Food Delivered Fast</h1>
                <p>Get your favorite meals delivered to your doorstep in under 30 minutes. Fresh, hot, and always on time.</p>
                <div class="hero-buttons">
                    <a href="signup.jsp" class="btn-primary btn-large">Get Started</a>
                    <a href="#features" class="btn-secondary btn-large">Learn More</a>
                </div>
            </div>
            <div class="hero-image">
                <img src="https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg?auto=compress&cs=tinysrgb&w=800" alt="Delicious food delivery">
            </div>
        </div>
    </section>

    <!-- Features Section -->
    <section id="features" class="features">
        <div class="container">
            <h2>Why Choose QuickBite?</h2>
            <div class="features-grid">
                <div class="feature-card">
                    <div class="feature-icon">⚡</div>
                    <h3>Lightning Fast</h3>
                    <p>Average delivery time of 25 minutes or less</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">🏆</div>
                    <h3>Premium Quality</h3>
                    <p>Partner with the best restaurants in your area</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">📱</div>
                    <h3>Easy Ordering</h3>
                    <p>Simple, intuitive interface for seamless ordering</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">💰</div>
                    <h3>Great Prices</h3>
                    <p>Competitive pricing with exclusive discounts</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Call to Action -->
    <section class="cta">
        <div class="container">
            <h2>Ready to Order?</h2>
            <p>Join thousands of satisfied customers and start enjoying great food today!</p>
            <a href="signup.jsp" class="btn-primary btn-large">Sign Up Now</a>
        </div>
    </section>

    <!-- Footer -->
    <footer class="footer">
        <div class="container">
            <div class="footer-content">
                <div class="footer-section">
                    <h3>🍀🍴 QuickBite</h3>
                    <p>Making food delivery simple and delicious.</p>
                </div>
                <div class="footer-section">
                    <h4>Quick Links</h4>
                    <ul>
                        <li><a href="signup.jsp">Sign Up</a></li>
                        <li><a href="login.jsp">Log In</a></li>
                        <li><a href="#features">Features</a></li>
                    </ul>
                </div>
                <div class="footer-section">
                    <h4>Contact</h4>
                    <p>Email: foodie@quickbite.com</p>
                    <p>Phone: 080-23469879</p>
                </div>
            </div>
            <div class="footer-bottom">
                <p>&copy; 2025 QuickBite. All rights reserved.</p>
            </div>
        </div>
    </footer>
</body>
</html>