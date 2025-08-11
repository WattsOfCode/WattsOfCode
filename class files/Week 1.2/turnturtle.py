'''
	Name: John Deardorff
	Recoded Date: 

	Description: Application (program)
	application use test for: variable intergration with calculations,
    print outs, turtle shapes function
'''
import turtle

def turtleShapes():
	turtle.write("Turtle power!")

	# Shape Square
	turtle.pencolor("green")
	turtle.forward(100)
	turtle.right(90)
	turtle.forward(100)
	turtle.right(90)
	turtle.forward(100)
	turtle.right(90)
	turtle.forward(100)
	turtle.right(90)

	# Shape Circle
	turtle.pencolor("red")
	turtle.circle(50)

	# reseting to no color for seperation
	turtle.pencolor("")
	turtle.backward(150)

	# Shape Octogon
	turtle.pencolor("blue")
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.left(45)
	turtle.backward(50)
	turtle.right(45)

	# reseting to no color for seperation
	turtle.pencolor("")
	turtle.forward(25)
	turtle.done() 