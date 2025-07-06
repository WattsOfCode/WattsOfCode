# this will be a simple python program
# function simple calculation
# Author: john deardorff
# Start Date: 07/03/2025
# 
# create function for each computation type subtract, add, multiply, divide
# additional features added on 07/5/2025 [Squaring and Squar roots]

# imports
import math
import tkinter as tk
import tkinter.messagebox
from tkinter.constants import SUNKEN

def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero")
    return a / b

def squared(a, b):
    if a < 0:
        raise ValueError("Cannot raise negatives")
    return a ** b

def squareRoot(a):
    if a < 0:
        raise ValueError("Cannot square root negatives")
    return math.sqrt(a)

win = tk.Tk()
win.title('Simple Calculator')

frame = tk.Frame(win, bg="grey", padx=15)
frame.pack()

entry = tk.Entry(frame, relief=SUNKEN, borderwidth=5, width=45)
entry.grid(row=0, column=0, columnspan=4, ipady=2, pady=2)

def click(num):
    entry.insert(tk.END, num)

def evaluate_expression(expression):
    try:
        # Handle epty inputs
        if not expression or expression.isspace():
            raise ValueError("No expression")

        # Handle square root
        if expression.startswith('\u221A'):
            num = float(expression[1:].strip())
            return squareRoot(num)
        
        # Split other expressions into numbers and operators
        for op in ['+', '-', '*', '/', '^']:
            if op in expression:
                num1, num2 = expression.split(op, 1)
                num1, num2 = float(num1.strip()), float(num2.strip())

                if op == '+':
                    return add(num1, num2)
                elif op == '-':
                    return subtract(num1, num2)
                elif op == '*':
                    return multiply(num1, num2)
                elif op == '/':
                    return divide(num1, num2)
                elif op == '^':
                    return squared(num1, num2)
                
        raise ValueError("Invalid expression")
    except ValueError as vError:
        tk.messagebox.showinfo("Error", str(vError))
    except Exception as e:
        tk.messagebox.showinfo("Error", f"Syntax Error: {str(e)}")
    return None

def equal():
    expression = entry.get()
    result = evaluate_expression(expression)
    if result is not None:
        entry.delete(0, tk.END)
        entry.insert(0, str(result))

def clear():
    entry.delete(0, tk.END)

buttons = [
    ('1', 1, 0), ('2', 1, 1), ('3', 1, 2), ('+', 1, 3),
    ('4', 2, 0), ('5', 2, 1), ('6', 2, 2), ('-', 2, 3), 
    ('7', 3, 0), ('8', 3, 1), ('9', 3, 2), ('*', 3, 3),
    ('0', 4, 1), ('.', 4, 2), ('/', 4, 3), 
    ('^',5 , 1), ('\u221A', 5, 2)
]

for txt, r, c in buttons[:-2]:
    tk.Button(frame, text=txt, padx=15, pady=5, width=3,
              command=lambda t=txt: click(t)).grid(row=r, column=c, pady=2, sticky='ew')

tk.Button(frame, text='^', padx=15, pady=5, width=3,
          command=lambda: click('^')).grid(row=5, column=0, pady=2, sticky='ew')
tk.Button(frame, text='\u221A', padx=15, pady=5, width=3,
          command=lambda: click('\u221A')).grid(row=5, column=1, pady=2, sticky='ew')

tk.Button(frame, text="Clear", padx=10, pady=5, width=6,
          command=clear).grid(row=6, column=0, columnspan=3, pady=2, sticky='ew')
tk.Button(frame, text="=", padx=10, pady=5, width=3,
          command=equal).grid(row=6, column=3, pady=2, sticky='ew')

win.mainloop()