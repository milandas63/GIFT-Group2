"""
     WAP to draw a triangle of palindrome numbers
"""
def is_palindrome(n):
    return str(n) == str(n)[::-1]
def draw_palindrome_triangle(rows):
    current_row = 1
    num = 1
    while current_row <= rows
        for _ in range(current_row):
            while not is_palindrome(num):
                num += 1
            line += str(num).rjust(5)
            num += 1
        print(line)
        current_row += 1

Output:
              1             
             121                  
            12321                 
           1234321               
          123454321              
         12345654321          
        1234567654321          
       123456787654321       
      12345678987654321    
                            
                                 

