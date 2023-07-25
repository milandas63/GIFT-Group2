"""
Write a program to perform a Temperature calculator works ?
"""
def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32
def celsius_to_kelvin(celsius):
    return celsius + 273.15
def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9
def fahrenheit_to_kelvin(fahrenheit):
    return (fahrenheit - 32) * 5/9 + 273.15
def kelvin_to_celsius(kelvin):
    return kelvin - 273.15
def kelvin_to_fahrenheit(kelvin):
    return (kelvin - 273.15) * 9/5 + 32
def main():
    print("Temperature Calculator")
    print("----------------------")
    print("1. Celsius to Fahrenheit")
    print("2. Celsius to Kelvin")
    print("3. Fahrenheit to Celsius")
    print("4. Fahrenheit to Kelvin")
    print("5. Kelvin to Celsius")
    print("6. Kelvin to Fahrenheit")
    print("0. Exit")

    while True:
        choice = input("Enter your choice (0-6): ")
        if choice == '0':
            print("Exiting the program.")
            break
        elif choice in {'1', '2', '3', '4', '5', '6'}:
            temperature = float(input("Enter the temperature: "))
            if choice == '1':
                result = celsius_to_fahrenheit(temperature)
                print(f"{temperature:.2f} Celsius = {result:.2f} Fahrenheit")
            elif choice == '2':
                result = celsius_to_kelvin(temperature)
                print(f"{temperature:.2f} Celsius = {result:.2f} Kelvin")
            elif choice == '3':
                result = fahrenheit_to_celsius(temperature)
                print(f"{temperature:.2f} Fahrenheit = {result:.2f} Celsius")
            elif choice == '4':
                result = fahrenheit_to_kelvin(temperature)
                print(f"{temperature:.2f} Fahrenheit = {result:.2f} Kelvin")
            elif choice == '5':
                result = kelvin_to_celsius(temperature)
                print(f"{temperature:.2f} Kelvin = {result:.2f} Celsius")
            elif choice == '6':
                result = kelvin_to_fahrenheit(temperature)
                print(f"{temperature:.2f} Kelvin = {result:.2f} Fahrenheit")
        else:
            print("Invalid choice. Please enter a valid option (0-6).")
if __name__ == "__main__":
    main()

