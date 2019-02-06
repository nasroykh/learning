__author__ = "nasro_ykh"

from random import randint

g_num = randint(1, 20)
print(g_num)
num = int(input("Guess the correct number between 1 and 20 :  "))
rep = "y"
g_count = 1

if num == g_num:
    print("Oh my God ! You guessed it on the first try !")

else:
    while num != g_num and rep == "y":

        if num < g_num:
            print("Higher than that !")
            num = int(input("Re-enter a number :"))
            g_count += 1
        elif num > g_num:
            print("Lower than that !")
            num = int(input("Re-enter a number :"))
            g_count += 1

        print("Congrats, you won !\n" + "Number of tries : " + str(g_count))
        g_num = randint(1, 20)
        g_count = 1
        rep = input("Would you like to replay ? y/n :")

        if rep == "y":
            num = int(input("Guess the correct number between 1 and 20 :  "))
        else:
            print("Okay, Good bye then !")
