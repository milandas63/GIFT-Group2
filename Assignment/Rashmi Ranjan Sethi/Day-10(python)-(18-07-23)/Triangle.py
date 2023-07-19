#                  *
#  				        * *
#					       *   *
#					      *     *
#					     *       *
#					    *         *
#					   *           *
#					  *             *
#					 *               *
#					*******************


def print_pattern(rows):
    for i in range(1, rows + 1):
        spaces = " " * (rows - i)
        stars = "*" if i == 1 or i == rows else "* " + " " * (2 * i - 3) + "*"
        print(spaces + stars)

rows = 10
print_pattern(rows)
