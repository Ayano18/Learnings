def void():
    global fav
    fav = input("Enter your fave drinks: ")
    print("delicious "+ fav)

void()
print()
def parameter(prog):

    print("What programming language is this?: ")
    return prog

parameter("Python")
parameter("Java")
parameter("Javascript")
print()
print()

#Keyword Arguments
def argue(child1, child2, child3):
    print("The youngest child is " + child3)

argue(child1 = "One", child2 = "Two", child3 = "Three")
print()

"""
def square(number):
  # This function squares a number and returns the result.
  # Calculate the square
  result = number * number
  # Return the result
  return result

# Get a number from the user
user_number = int(input("Enter a number: "))

# Call the square function and store the returned value
# Print the squared number
print(f"The square of {user_number} is {square(user_number)}")
"""