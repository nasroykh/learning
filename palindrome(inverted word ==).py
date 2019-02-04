word = input("Enter the word : ")
r_word = word[::-1]   # r_word is 'word' reverted
if word == r_word:
    print("This string is a palindrome")   # if we can read it the same backwards as forwards
else:
    print("This is not a palindrome")     # if we can't read it the same backwards as forwards
