try:
    num = int(input("Enter a number : "))
except ValueError:
    num = input("Error; Re-enter a correct int number : ")
divs = []
while int(num) % 2 == 0:
    num /= 2
    divs.append(int(num))
if len(divs) >= 1:
    print(divs)
else:
    print("This number has no divisors")
