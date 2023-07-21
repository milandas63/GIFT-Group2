"""
   WAP to draw a diamond style of asterisks
"""
def draw_diamond(height):
    if height % 2 == 0:
        height += 1  
    for i in range(1, height + 1, 2):
        print(("*" * i).rjust(height)) 
    for i in range(height - 2, 0, -2):
        print(("*" * i).rjust(height))
draw_diamond(16)
    
                    *           
                   ***                  
                  *****                 
                 *******              
                *********            
               ***********          
              *************         
             ***************      
             ***************                           
              *************
               ***********
                *********
                 *******
                  *****
                   ***
                    *

