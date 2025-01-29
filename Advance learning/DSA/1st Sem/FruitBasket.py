stack = []
print("Enter number of fruits: ")
catch = int(input())

for i in range(catch):
    while True:
        choice = input("Enter A for apple, O for orange, M for mango, G for guava : \n")
        if choice in ["A", "a", "O", "o", "M", "m", "G", "g"]:
            if choice == "A" or choice == "a":
                stack.append("Apple")
            elif choice == "O" or choice == "o":
                stack.append("Orange")
            elif choice == "M" or choice == "m":
                stack.append("Mango")
            elif choice == "G" or choice == "g":
                stack.append("Guava")
            break
        else:
            print("Invalid input. Please enter A, O, M, or G.")

print(stack)

while stack:
    print("Enter E to eat the fruits")
    Ey = input()
    if Ey == "E" or Ey == "e":
        stack.pop()
        if not stack:
            print("No no fruits exist na")
        else:
            print("Remaining: ", stack)
    else:
        print("Invalid Input")