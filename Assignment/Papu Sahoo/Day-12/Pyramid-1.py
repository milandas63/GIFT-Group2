"""
 WAP to draw a triangle of asterisks
"""
def draw_triangle(height):
    for i in range(1, height + 1):
        line = '*' * (2 * i - 1)
        print(line.rjust(height + i - 1))
height = 8
draw_triangle(height)
   
              *           
             ***                
           *******               
          *********             
         ***********           
        *************         
       ***************        
      *****************      
