WAP to drow a triangle of palindrome number:
                  
                  1        
	               121       
	              12321      
               1234321     
              123454321    
             12345654321   
            1234567654321  
           123456787654321 
          12345678987654321

def print_pattern(rows):
    for i in range(1, rows + 1):
        spaces = " " * (rows - i)
        numbers = " ".join(str(j) for j in range(1, i + 1))
        line = spaces + numbers + " " + numbers[-2::-1]
        print(line)
rows = 9
print_pattern(rows)
