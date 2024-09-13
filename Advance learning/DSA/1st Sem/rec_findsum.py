num = int(input("Enter a number: "))
def findsum(num):
    if num == 0:
        return 0
    else:
        return num + findsum(num - 1)

for i in range(num + 1):
        print(i, end=". ")

print()#adding newline coz of for loops
all = findsum(num)
print("Entered num: "+ str(num))
print("The sum of all numbers: "+ str(all))
