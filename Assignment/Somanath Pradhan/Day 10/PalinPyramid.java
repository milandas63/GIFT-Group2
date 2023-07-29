def draw_palindrome_pyramid(rows): 
     for i in range(1, rows + 1): 
         for j in range(1, i + 1): 
             print(j, end=' ') 
         for j in range(i - 1, 0, -1): 
             print(j, end=' ') 
  
         print() 
 num_rows = int(input("Enter the number of rows for the palindrome pyramid: ")) 
 draw_palindrome_pyramid(num_rows)
