
# write the pyramid program using rjust() function? 
  
  
  
 def print_pyramid(rows): 
     for i in range(1, rows + 1): 
         # Calculate the number of spaces on the left side of the pyramid 
         spaces = (rows - i) * " " 
  
         # Calculate the number of stars in each row 
         stars = (2 * i - 1) * "*" 
  
         # Combine spaces and stars and print the row 
         print(spaces.rjust(rows + i - 1) + stars) 
  
 # Example usage: 
 num_rows = 5 
 print_pyramid(num_rows)