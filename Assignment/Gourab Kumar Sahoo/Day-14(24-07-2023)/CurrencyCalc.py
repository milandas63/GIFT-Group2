def convert_currency(amount, from_currency, to_currency, exchange_rates):
    if from_currency not in exchange_rates or to_currency not in exchange_rates:
        print("Currency not supported.")
        return None

    from_rate = exchange_rates[from_currency]
    to_rate = exchange_rates[to_currency]

    converted_amount = amount * (to_rate / from_rate)
    return converted_amount

if __name__ == "__main__":
    print("Welcome to the Currency Calculator!")

    exchange_rates = {
        "USD": 1.0,    # Example: 1 USD = 1.0 USD (base currency)
        "EUR": 0.85,   # Example: 1 USD = 0.85 EUR
        "GBP": 0.75,   # Example: 1 USD = 0.75 GBP
        "JPY": 110.0,  # Example: 1 USD = 110 JPY
        # Add more exchange rates as needed
    }

    while True:
        print("\nChoose an option:")
        print("1. Convert from USD")
        print("2. Convert to USD")
        print("3. Exit")

        choice = input("Enter your choice (1-3): ")

        if choice == '1':
            amount = float(input("Enter amount in USD: "))
            to_currency = input("Enter target currency (e.g., EUR, GBP, JPY): ").upper()
            converted_amount = convert_currency(amount, "USD", to_currency, exchange_rates)
            if converted_amount is not None:
                print(f"{amount:.2f} USD is equal to {converted_amount:.2f} {to_currency}.")

        elif choice == '2':
            amount = float(input("Enter amount: "))
            from_currency = input("Enter source currency (e.g., EUR, GBP, JPY): ").upper()
            converted_amount = convert_currency(amount, from_currency, "USD", exchange_rates)
            if converted_amount is not None:
                print(f"{amount:.2f} {from_currency} is equal to {converted_amount:.2f} USD.")

        elif choice == '3':
            print("Thank you for using the Currency Calculator. Goodbye!")
            break

        else:
            print("Invalid choice. Please choose a valid option (1-3).")
