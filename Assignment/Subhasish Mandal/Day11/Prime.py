def is_prime(number):
    if number < 2:
        return False
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False
    return True

lower_limit = 1000
upper_limit = 3000

print("Prime numbers between", lower_limit, "and", upper_limit, "are:")
for number in range(lower_limit, upper_limit + 1):
    if is_prime(number):
        print(number)
