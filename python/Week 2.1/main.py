'''
author john deardorff
date 06/13/2025
Application (program)
Description
    simple guessing game in terminal. system will 
    user will be told if they are to low or high or if the are correct.
    input & output Processing
    using a while loop and if, elif, else 
    
'''

from random import randint

print ("John Deardorff")
num = randint(1, 9)
user_guess = 0
guess = 0
while user_guess !=num:
    user_guess = int(input("Guess a number between 1 and 9: "))
    guess += 1
    if user_guess < num:
        print("number is to low.")
    elif user_guess > num:
        print("Guess is to high.")
    else:
        print(f"Youguessed it! you won in {guess} guesses!")