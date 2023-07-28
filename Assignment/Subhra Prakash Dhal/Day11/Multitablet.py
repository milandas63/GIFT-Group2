
# Mutiplication Tables program 
 start = 2 
 end = 10 
 for i in range(2, end+1, 5): 
         for j in range(1, 11): 
                 for k in range(i, i+5): 
                         if k>end: 
                                 break 
                         # print(padL(k,2),"x",padL(j,2),"=",padL((k*j),3)," ", end='') 
                         print(str(k).rjust(2,' '),"x",str(j).rjust(2,' '),"=",str(k*j).rjust(3,' ')," ", end='') 
                 print() 
         print() 
  
 print() 
  
  
 print("-----------------------------------------x----------------------------") 
  
 """ 
         WAP to print all mutiplication tables between 2 and 25. Five tables to be printed 
         in a row. 
 """ 
 def padL(n, l): 
         rValue = str(n)                                        # str() is the function to covert a number to string 
         for i in range(len(rValue), l):        # len() function return the length of a string 
                 rValue = " "+rValue 
         return rValue 
  
  
  
 start = 2 
 end = 25 
 for i in range(start, end+1, 5): 
         for j in range(1, 11): 
                 for k in range(i, i+5): 
                         if k>end:  
                                 break 
                         print(padL(k,2),"x",padL(j,2),"=",padL((k*j),3),' ', end='') 
                 print() 
         print()