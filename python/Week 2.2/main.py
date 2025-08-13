'''
author: John Deardorff
Date: 08/13/2025
Application (program)
Description: 
    Application will be issuing 100 random numbers in a list
    and sort them
'''

import random
list = []
count = 0

# to change output change the range number from 100 to desired amount.
# change randint (1,100) to desired random range options
for i in range (100):
    list.append(random.randint(1, 100))
    count += 1

list.sort()

print(list)
print(count)