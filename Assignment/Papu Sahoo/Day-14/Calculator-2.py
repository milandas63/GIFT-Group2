"""
Write a program to perform Age calculator ?
"""
from datetime import datetime

def calculate_age(birthdate):
    try:
        birthdate = datetime.strptime(birthdate, "%Y-%m-%d")
        current_date = datetime.now()
        age = current_date.year - birthdate.year - ((current_date.month, current_date.day) < (birthdate.month, birthdate.day))
        return age
    except ValueError:
        return "Invalid date format. Please use 'YYYY-MM-DD'."

def main():
    print("Welcome to the Age Calculator")
    birthdate_input = input("Please enter your birthdate (YYYY-MM-DD): ")

    age = calculate_age(birthdate_input)
    if isinstance(age, int):
        print(f"You are {age} years old.")
    else:
        print(age)

if __name__ == "__main__":
    main()

