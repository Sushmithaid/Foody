<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Delivery Confirmation</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        @keyframes delivery {
            0% {
                left: -10%;
                transform: translateY(-50%) scale(0.8);
            }
            50% {
                transform: translateY(-50%) scale(1);
            }
            100% {
                left: 110%;
                transform: translateY(-50%) scale(0.8);
            }
        }

        @keyframes progress {
            0% {
                width: 0%;
            }
            100% {
                width: 75%;
            }
        }

        @keyframes float {
            0%, 100% {
                transform: translateY(0px);
            }
            50% {
                transform: translateY(-10px);
            }
        }

        .animate-delivery {
            animation: delivery 8s ease-in-out infinite;
        }

        .animate-progress {
            animation: progress 2s ease-out forwards;
        }

        .animate-float {
            animation: float 3s ease-in-out infinite;
        }

        .animate-float-delayed-1 {
            animation: float 3s ease-in-out infinite;
            animation-delay: 1s;
        }

        .animate-float-delayed-2 {
            animation: float 3s ease-in-out infinite;
            animation-delay: 2s;
        }

        /* Custom bike icon using CSS */
        .bike-icon {
            width: 24px;
            height: 24px;
            background: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' fill='none' stroke='white' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'%3E%3Ccircle cx='18.5' cy='17.5' r='3.5'/%3E%3Ccircle cx='5.5' cy='17.5' r='3.5'/%3E%3Ccircle cx='15' cy='5' r='1'/%3E%3Cpath d='m14 17 6-6'/%3E%3Cpath d='m9 17 5-5'/%3E%3Cpath d='M9 5h4l2 8'/%3E%3C/svg%3E") no-repeat center;
            background-size: contain;
        }

        /* Custom check circle icon */
        .check-icon {
            width: 64px;
            height: 64px;
            background: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='64' height='64' viewBox='0 0 24 24' fill='none' stroke='%2310b981' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'%3E%3Cpath d='M22 11.08V12a10 10 0 1 1-5.93-9.14'/%3E%3Cpolyline points='22,4 12,14.01 9,11.01'/%3E%3C/svg%3E") no-repeat center;
            background-size: contain;
        }

        /* Custom clock icon */
        .clock-icon {
            width: 16px;
            height: 16px;
            background: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='16' height='16' viewBox='0 0 24 24' fill='none' stroke='%23ea580c' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'%3E%3Ccircle cx='12' cy='12' r='10'/%3E%3Cpolyline points='12,6 12,12 16,14'/%3E%3C/svg%3E") no-repeat center;
            background-size: contain;
        }
    </style>
</head>
<body>
    <div class="min-h-screen bg-gradient-to-br from-orange-50 to-red-50 flex items-center justify-center p-4">
        <div class="max-w-md w-full bg-white rounded-2xl shadow-xl p-8 text-center relative overflow-hidden">
            <!-- Background decoration -->
            <div class="absolute top-0 left-0 w-full h-2 bg-gradient-to-r from-orange-400 to-red-400"></div>
            
            <!-- Success icon -->
            <div class="mb-6">
                <div class="check-icon mx-auto animate-pulse"></div>
            </div>
            
            <!-- Main message -->
            <h1 class="text-2xl font-bold text-gray-800 mb-4 leading-tight">
                Your Food is Ordered!
            </h1>
            
            <p class="text-lg text-gray-600 mb-8">
                It will arrive within 
                <span class="inline-flex items-center gap-1 text-orange-600 font-semibold mx-1">
                    <span class="clock-icon"></span>
                    30 minutes
                </span>
            </p>
            
            <!-- Animated delivery vehicle -->
            <div class="relative h-20 mb-6 overflow-hidden">
                <div class="absolute inset-0 flex items-center">
                    <!-- Road -->
                    <div class="w-full h-1 bg-gray-300 relative">
                        <div class="absolute inset-0 bg-gradient-to-r from-transparent via-gray-400 to-transparent animate-pulse"></div>
                    </div>
                </div>
                
                <!-- Moving delivery bike -->
                <div class="absolute top-1/2 transform -translate-y-1/2 animate-delivery">
                    <div class="flex items-center gap-2 bg-orange-500 text-white px-3 py-2 rounded-full shadow-lg">
                        <div class="bike-icon"></div>
                        <span class="text-sm font-medium">On the way!</span>
                    </div>
                </div>
            </div>
            
            <!-- Order details -->
            <div class="bg-gray-50 rounded-xl p-4 mb-6">
                <h3 class="font-semibold text-gray-800 mb-2">Order Status</h3>
                <div class="flex items-center justify-between text-sm text-gray-600">
                    <span>Preparing</span>
                    <div class="flex-1 mx-3 h-1 bg-gray-200 rounded">
                        <div class="h-full bg-orange-400 rounded animate-progress"></div>
                    </div>
                    <span>Delivered</span>
                </div>
            </div>
            
            <!-- Action button -->
            <form action="#WelcomeServlet" method="post">
            <button class="w-full bg-gradient-to-r from-orange-500 to-red-500 text-white font-semibold py-3 px-6 rounded-xl hover:from-orange-600 hover:to-red-600 transition-all duration-300 transform hover:scale-105 shadow-lg hover:shadow-xl">
                Track Your Order
            </button>
            </form>
            
            <!-- Floating food emojis -->
            <div class="absolute -top-2 -right-2 text-2xl animate-float">🍕</div>
            <div class="absolute top-8 -left-2 text-xl animate-float-delayed-1">🍔</div>
            <div class="absolute bottom-8 -right-1 text-lg animate-float-delayed-2">🍟</div>
        </div>
    </div>

    <script>
        // Add click handler for the track button
        document.querySelector('button').addEventListener('click', function() {
            alert('Tracking feature coming soon! Your order is being prepared with care.');
        });

        // Add some interactive hover effects
        const card = document.querySelector('.max-w-md');
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'scale(1.02)';
            this.style.transition = 'transform 0.3s ease';
        });
        
        card.addEventListener('mouseleave', function() {
            this.style.transform = 'scale(1)';
        });
    </script>
</body>
</html>