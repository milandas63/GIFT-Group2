
""" 
         WAP to print each digit in a number to words 
                 573 
                 Five Seven Three 
                 49258 
                 Four Nine Two Five Eight 
 """ 
 number = 5537812 
 numStr = str(number) 
 for i in range(0,len(numStr)): 
         each = numStr[i] 
         if each=="0": 
                 print("Zero",end=" ") 
         elif each=="1": 
                 print("One",end=" ") 
         elif each=="2": 
                 print("Two",end=" ") 
         elif each=="3": 
                 print("Three",end=" ") 
         elif each=="4": 
                 print("Four",end=" ") 
         elif each=="5": 
                 print("Five",end=" ") 
         elif each=="6": 
                 print("Six",end=" ") 
         elif each=="7": 
                 print("seven",end=" ") 
         elif each=="8": 
                 print("Eight",end=" ") 
         elif each=="9": 
                 print("Nine",end=" ") 
  
 print() 
 print("------------------------------ Next --------------------------------") 
  
 number = 6537810 
 digit_names = ["Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"] 
 numStr = str(number) 
 for i in range(0, len(numStr)): 
         each = int(numStr[i]) 
         print(digit_names[each], end=" ")