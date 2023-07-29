def draw_pyramid(rows): 
     for i in range(rows): 
         print(' ' * (rows - i - 1) + '*' * (2 * i + 1)) 
 num_rows = int(input("Enter the number of rows for the pyramid: ")) 
 draw_pyramid(num_rows)
