// Write a program to print all PRIME NUMBER between 1000 and 3000 //

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True
def print_prime_numbers(start, end):
    primes = [num for num in range(start, end + 1) if is_prime(num)]
    return primes
if __name__ == "__main__":
    start_range = 1000
    end_range = 3000
 prime_numbers = print_prime_numbers(start_range, end_range)
    print("Prime numbers between 1000 and 3000:")
    print(prime_numbers)

Output:
Prime numbers between 1000 and 3000:
[1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, 1103, .....................]

