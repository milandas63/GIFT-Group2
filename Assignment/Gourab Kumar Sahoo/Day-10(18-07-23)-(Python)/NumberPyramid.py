 """                                            1        
					       121       
					      12321      
					     1234321     
					    123454321    
					   12345654321   
					  1234567654321  
					 123456787654321 
					12345678987654321
"""



spaces = 50
    for i in range(1, 10):
            for j in range(0, spaces):
                print(" ", end="")
            for j in range(1, i + 1):
                print(j, end="")
            for j in range(i - 1, 0, -1):
                print(j, end="")


                 or


def print_pattern(rows):
    for i in range(1, rows + 1):
        spaces = " " * (rows - i)
        numbers = " ".join(str(j) for j in range(1, i + 1))
        line = spaces + numbers + " " + numbers[-2::-1]
        print(line)

rows = 9
print_pattern(rows)
