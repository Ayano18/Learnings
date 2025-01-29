students = {}

print("Enter details for 3 classmates")
for i in range(1, 4):
    studentnum = input(f"Enter student number for classmate {i}: ")
    firstname = input(f"Enter first name for classmate {i}: ")
    students[studentnum] = firstname

print("\nStudent List:")
for studentnum, firstname in students.items():
    print(f"Student Number: {studentnum}, First Name: {firstname}")


third_key = list(students.keys())[2]
students.pop(third_key)
print("\nRemoved the third entry.")


userstudentnumber = input("Enter your student number: ")
userfirstname = input("Enter your first name: ")
students[userstudentnumber] = userfirstname


print("\nFinal Student List:")
for studentnum, firstname in students.items():
    print(f"Student Number: {studentnum}, First Name: {firstname}")
