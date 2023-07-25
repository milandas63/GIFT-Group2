"""
Write a program to perform Currency calculator works ?
"""
from forex_python.converter import CurrencyRates

def get_currency_rate(base_currency, target_currency):
    c = CurrencyRates()
    return c.get_rate(base_currency, target_currency)

def convert_currency(amount, rate):
    return amount * rate

def main():
    print("Welcome to Currency Calculator!")
    base_currency = input("Enter the base currency code (e.g., USD, EUR, GBP): ").upper()
    target_currency = input("Enter the target currency code (e.g., USD, EUR, GBP): ").upper()
    amount = float(input("Enter the amount: "))

    try:
        rate = get_currency_rate(base_currency, target_currency)
        converted_amount = convert_currency(amount, rate)

        print(f"{amount:.2f} {base_currency} is equivalent to {converted_amount:.2f} {target_currency}")
    except ValueError as e:
        print("Error:", e)

if __name__ == "__main__":
    main()

