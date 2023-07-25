"""
                     *
			        ***
			       *****
			      *******
			     *********
			    ***********
			   *************
			  ***************
 		     *****************
"""


spaces = 50
stars = 1
for i in range(1, 10):
	for j in range(0, spaces):
		print(" ", end="")
	for j in range(0, stars):
		print("*", end="")
	print()
	spaces = spaces-1
	stars = stars+2            

       or

def print_pattern(rows):
    for i in range(rows):
        spaces = " " * (rows - i - 1)
        stars = "*" * (2 * i + 1)
        print(spaces + stars)

rows = 9
print_pattern(rows)
