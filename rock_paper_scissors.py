__author__ = "nasro_ykh"

import random

comp_choice_list = ["Rock", "Paper", "Scissors"]
score = 0
num_try = 0

print("         Welcome to my game")
print("------------------------------------")
print("      Rock ! Paper ! Scissors !     ")
print("------------------------------------")
print("            Let's begin !           ")
print("------------------------------------")
print("Please respect first capital letters")
print("------------------------------------")

choice = input(" ___________\n|- Rock     |\n|- Paper    |\n|- Scissors |\n-------------\nMake a choice ! : ")
comp_choice = comp_choice_list[random.randint(0, 2)]

while score < 10 and num_try != 7:
    if (choice == "Rock" and comp_choice == "Scissors") or (choice == "Scissors" and comp_choice == "Paper")\
            or (choice == "Paper" and comp_choice == "Rock"):
        score += 3
        num_try += 1
        print(" _________________________________")
        print("|                                 |")
        print("|"+choice + " VS " + comp_choice+"|")
        print("|_________________________________|")
        print("------------ You won ! ------------")
        comp_choice = comp_choice_list[random.randint(0, 2)]
        if num_try < 7 and score < 10:
            print("Please re-make a choice")
            choice = input(" ___________\n|- Rock     |\n|- Paper    |\n"
                           "|- Scissors |\n-------------\nMake a choice ! : ")

    elif (choice == "Rock" and comp_choice == "Paper") or (choice == "Scissors" and comp_choice == "Rock")\
            or (choice == "Paper" and comp_choice == "Scissors"):
        num_try += 1
        print(" _________________________________")
        print("|                                 |")
        print("|"+choice + " VS " + comp_choice+"|")
        print("|_________________________________|")
        print("------------ You lost ! -----------")
        comp_choice = comp_choice_list[random.randint(0, 2)]
        if num_try < 7 and score < 10:
            print("Please re-make a choice")
            choice = input(" ___________\n|- Rock     |\n|- Paper    |\n"
                           "|- Scissors |\n-------------\nMake a choice ! : ")

    elif choice == comp_choice:
        num_try += 1
        score += 1
        print(" _________________________________")
        print("|                                 |")
        print("|"+choice + " VS " + comp_choice+"|")
        print("|_________________________________|")
        print("------------- Draw ! --------------")
        comp_choice = comp_choice_list[random.randint(0, 2)]
        if num_try < 7 and score < 10:
            print("Please re-make a choice")
            choice = input(" ___________\n|- Rock     |\n|- Paper    |\n"
                           "|- Scissors |\n-------------\nMake a choice ! : ")

print("Your score :" + str(score))

if (score >= 10) and (num_try < 7):
    print(" _____________________________________")
    print("|                                     |")
    print("|Congratulations !, you won the game !|")
    print("|_____________________________________|")

elif num_try == 7:
    print(" _____________________________________")
    print("|                                     |")
    print("|     Oh no ! you lost the game !     |")
    print("|_____________________________________|")
