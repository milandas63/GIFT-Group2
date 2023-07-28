
import datetime 
  
 def calculate_age(birthdate): 
     today = datetime.date.today() 
     age = today.year - birthdate.year - ((today.month, today.day) < (birthdate.month, birthdate.day)) 
     return age 
  
 def get_birthdate_from_user(): 
     while True: 
         try: 
             birthdate_str = input("Enter your birthdate (YYYY-MM-DD): ") 
             birthdate = datetime.datetime.strptime(birthdate_str, "%Y-%m-%d").date() 
             return birthdate 
         except ValueError: 
             print("Invalid date format. Please use YYYY-MM-DD format.") 
  
 if __name__ == "__main__": 
     print("Welcome to the Age Calculator!") 
     birthdate = get_birthdate_from_user() 
     age = calculate_age(birthdate) 
     print(f"You are {age} years old.")