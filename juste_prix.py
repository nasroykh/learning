import random
correct_price = random.randint(50000, 300000)
nbr_try = 0

price = input("Guess the correct price (Between 50000 et 300000) : ")
nbr_try += 1

while int(price) != int(correct_price) and nbr_try != 20:    #if number of tries reach 20, you lose

    if int(price) > int(correct_price):
        print("Lower than that ! ")         #Enter a price lower than the last one entered
        price = input("Enter a price : ")
        nbr_try += 1
    elif int(price) < int(correct_price):
        print("Higher than that !")         #Enter a price higher than the last one entered
        price = input("Enter a price : ")
        nbr_try += 1

if int(price) == int(correct_price):
    print("Perfect ! You win !")          #Winning by guessing the correct price
elif nbr_try == 20:
    print("Maximum number of try reached, You lose !")     #Losing by reaching maximum number of tries
