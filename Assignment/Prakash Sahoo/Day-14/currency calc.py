def inr_to_usd(amount):
    return amount / 74.5

def inr_to_eur(amount):
    return amount / 87.2

def inr_to_jpy(amount):
    return amount / 0.67

def inr_to_rub(amount):
    return amount / 1.02

def inr_to_cny(amount):
    return amount / 11.5

def usd_to_inr(amount):
    return amount * 74.5

def eur_to_inr(amount):
    return amount * 87.2

def jpy_to_inr(amount):
    return amount * 0.67

def rub_to_inr(amount):
    return amount * 1.02

def cny_to_inr(amount):
    return amount * 11.5

def main():
    more = True
    while more:
        print("\nCurrency Converter")
        print("------------------")
        print("1. Indian Rupees to American Dollars")
        print("2. Indian Rupees to Euros")
        print("3. Indian Rupees to Japanese Yen")
        print("4. Indian Rupees to Russian Rubles")
        print("5. Indian Rupees to Chinese Yuan")
        print("6. Exit")
        print()

        action = input("Choose an option [1-6]: ")

        if action == "1":
            amount = float(input("Enter amount in Indian Rupees: "))
            usd = inr_to_usd(amount)
            print("Amount in American Dollars (USD):", usd)

        elif action == "2":
            amount = float(input("Enter amount in Indian Rupees: "))
            eur = inr_to_eur(amount)
            print("Amount in Euros (EUR):", eur)

        elif action == "3":
            amount = float(input("Enter amount in Indian Rupees: "))
            jpy = inr_to_jpy(amount)
            print("Amount in Japanese Yen (JPY):", jpy)

        elif action == "4":
            amount = float(input("Enter amount in Indian Rupees: "))
            rub = inr_to_rub(amount)
            print("Amount in Russian Rubles (RUB):", rub)

        elif action == "5":
            amount = float(input("Enter amount in Indian Rupees: "))
            cny = inr_to_cny(amount)
            print("Amount in Chinese Yuan (CNY):", cny)

        elif action == "6":
            break

        else:
            print("Invalid option. Please choose a valid option.")

        more = input("\nMore [y/n]: ").lower() == 'y'

if __name__ == "__main__":
    main()


OUTPUT:
Currency Converter
------------------
1. Indian Rupees to American Dollars
2. Indian Rupees to Euros
3. Indian Rupees to Japanese Yen
4. Indian Rupees to Russian Rubles
5. Indian Rupees to Chinese Yuan
6. Exit

Choose an option [1-6]: 1
Enter amount in Indian Rupees: 1000
Amount in American Dollars (USD): 13.4228

More [y/n]: y

Currency Converter
------------------
1. Indian Rupees to American Dollars
2. Indian Rupees to Euros
3. Indian Rupees to Japanese Yen
4. Indian Rupees to Russian Rubles
5. Indian Rupees to Chinese Yuan
6. Exit

Choose an option [1-6]: 3
Enter amount in Indian Rupees: 5000
Amount in Japanese Yen (JPY): 7462.686567164179

More [y/n]: n


