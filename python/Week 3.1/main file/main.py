'''
Author: john deardorff
date: 08/13/2025
Application(program)
Description:
    creating a function to read a file
    that has one name per line to print.
    once the main.py is run then the
    sorted_names.txt file will bee filled
    with names of names.txt file.
'''

print(f"Reading the file: names.txt")
def readfile():
    path = "Week 3.1/names.txt"
    names = []
    fopen = open(path, "r")
    for line in fopen:
        line = line.replace("\n","")
        names.append(line)
    fopen.close()
    return names

def writefile(names):
    path = "Week 3.1/sorted_names.txt"
    fopen = open(path, "w")
    for name in names:
        fopen.write(name + "\n")
    fopen.close()

def appendfile(line):
    path = "Week 3.1/sorted_names.txt"
    fopen = open(path, "a")
    fopen.write(line + "\n")
    fopen.close()

names = readfile()
names.sort()
print(names)

print(f"Writing and appending file: sorted_names.txt")

names = readfile()
names.sort()
writefile(names)
appendfile("Last Line")