def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

def main():
    more = True
    while more:
        print("\nTemperature Converter")
        print("--------------------")
        print("1. Celsius to Fahrenheit")
        print("2. Fahrenheit to Celsius")
        print("3. Exit")
        print()

        action = input("Choose an option [1-3]: ")

        if action == "1":
            celsius = float(input("Enter temperature in Celsius: "))
            fahrenheit = celsius_to_fahrenheit(celsius)
            print("Temperature in Fahrenheit:", fahrenheit)

        elif action == "2":
            fahrenheit = float(input("Enter temperature in Fahrenheit: "))
            celsius = fahrenheit_to_celsius(fahrenheit)
            print("Temperature in Celsius:", celsius)

        elif action == "3":
            break

        else:
            print("Invalid option. Please choose a valid option.")

        more = input("\nMore [y/n]: ").lower() == 'y'

if __name__ == "__main__":
    main()


OUTPUT:
Temperature Converter
--------------------
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Exit

Choose an option [1-3]: 1
Enter temperature in Celsius: 25
Temperature in Fahrenheit: 77.0

More [y/n]: y

Temperature Converter
--------------------
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Exit

Choose an option [1-3]: 2
Enter temperature in Fahrenheit: 98.6
Temperature in Celsius: 37.0

More [y/n]: n


