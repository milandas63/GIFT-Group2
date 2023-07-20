""" Dimond shape pyramid
                                                *        
					       ***       
					      *****      
					     *******     
					    *********    
					   ***********   
					  *************  
					 *************** 
					*****************
					 *************** 
					  *************  
					   ***********   
					    *********    
					     *******     
					      *****      
					       ***       
					        *     
"""



spaces = 50
stars = 1
for i in range(1, 18):
    for j in range(0, spaces):
        print(" ", end="")
    for j in range(0, stars):
        print("*", end="")
    print()
    if i <= 8:
        spaces = spaces - 1
        stars = stars + 2
    else:
        spaces = spaces + 1
        stars = stars - 2




               or


def print_pattern(rows):
    for i in range(1, rows + 1):
        spaces = " " * (rows - i)
        stars = "*" * (2 * i - 1)
        print(spaces + stars)

    for i in range(rows - 1, 0, -1):
        spaces = " " * (rows - i)
        stars = "*" * (2 * i - 1)
        print(spaces + stars)

rows = 10
print_pattern(rows)
