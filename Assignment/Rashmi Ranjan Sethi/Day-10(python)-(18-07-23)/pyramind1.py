#
#              *
#			        ***
#			       *****
#			      *******
#			     *********
#			    ***********
#			   *************
#			  ***************
# 	   *****************


def print_pattern(rows):
    for i in range(rows):
        spaces = " " * (rows - i - 1)
        stars = "*" * (2 * i + 1)
        print(spaces + stars)

rows = 9
print_pattern(rows)
