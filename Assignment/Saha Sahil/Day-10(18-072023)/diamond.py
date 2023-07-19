 WAP to draw a diamond style of asterisks?
  

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
def draw_diamond(rows):
    for i in range(rows):
        print(' ' * (rows - i - 1) + '*' * (2 * i + 1))
    for i in range(rows - 2, -1, -1):
        print(' ' * (rows - i - 1) + '*' * (2 * i + 1))
num_rows = int(input("Enter the number of rows for the diamond: "))
draw_diamond(num_rows)
