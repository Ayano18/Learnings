def compare(first, second):
    if first > second:
        print(str(first) + " is greater than " + str(second))
    elif first < second:
        print(str(first) + " is less than " + str(second))
    else:
        print(str(first) + " is equal to " + str(second))

first = int(input("Enter first num: "))
second = int(input("Enter second num: "))
compare(first, second)
"""
def call():
    first = int(input("Enter first num: "))
    second = int(input("Enter second num: "))
    if first > second:
        print(str(first) + " is greater than " + str(second))
    elif first < second:
        print(str(first) + " is less than " + str(second))
    else:
        print(str(first) + " is equal to " + str(second))

call()
"""