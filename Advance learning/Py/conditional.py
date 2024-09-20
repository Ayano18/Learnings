age = int(input("Enter your age: "))

if age == 100:
    print(age, ", century old")
elif age <= 0:
    print(age, ", ur not born yet")
elif age >= 60:
    print(age, ", senior citizen")
else:
    print(age, ", Keep living")

print()
#reverse conditional using 'not'
temp = int(input("What is the temperature outside?: "))

if not (temp >= 0 and temp <= 30):
    print("the temperature is bad today")
    print("stay inside!")
elif not (temp < 0 or temp > 30):
    print("the temperature is good")
    print("go outside")
else:
    print("wrong input")
#you can use 'pass' declaration