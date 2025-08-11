'''
	Name: John Deardorff
	Recoded Date: 

	Description: Application (program)
	application use test for: variable intergration with calculations,
    print outs, turtle shapes function
'''
#import
import turtle
import turnturtle

print("John Deardroff's simple application")
num = float(input("Enter a number"))
num2 = float(num * 2)
num3 = float(num / 10)

print("Your number multiplied by 2: ", num2)
print("Your number divided by 10: ", num3)

answer = input("\nPress any other number than 0 for turtle otherwise press 0 to end: ")
if (answer != 0):
    turnturtle.turtleShapes()
elif answer == 0:
    print("See you next time!")
    


    

