""" 
 WAP TO DEIGNE A AGE CALCULATOR.. 
 """ 
 def calculate_age(birth_year, current_year): 
     age = current_year - birth_year 
     return age 
  
 def main(): 
     more = True 
     while more: 
         print("\nAge Calculator") 
         print("--------------") 
         birth_year = int(input("Enter your birth year: ")) 
         current_year = int(input("Enter the current year: ")) 
  
         age = calculate_age(birth_year, current_year) 
  
         print("\nYour age is:", age) 
  
         more = input("\nMore [y/n]: ").lower() == 'y' 
  
 if __name__ == "__main__": 
     main() 
  
  
  
 OUTPUT: 
 Age Calculator 
 -------------- 
 Enter your birth year: 1995 
 Enter the current year: 2023 
  
 Your age is: 28 
  
 More [y/n]: y 
  
 Age Calculator 
 -------------- 
 Enter your birth year: 2000 
 Enter the current year: 2023 
  
 Your age is: 23 
  
 More [y/n]: n
