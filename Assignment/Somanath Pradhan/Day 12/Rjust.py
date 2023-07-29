def print_pyramid(n): 
   for i in range(n): 
     print("  " * (n - i - 1) + ("*" * (2 * i + 1)).rjust(n)) 
 print_pyramid(5)
