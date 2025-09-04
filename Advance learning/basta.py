from collections import deque
movie = deque()
snack = deque()

for a in range(1, 4):
    print(f"Enter movies {a}: ")
    movies = input()
    movie.append(movies)
    
for b in range(1, 4):
    print(f"Enter snacks {b}: ")
    snacks = (input())
    snack.append(snacks)
    
    
print("Movies to watch are: ", movie)
print("Snacks to eat are: ", snack)

while snacks:
    print("Press S to each time you finish a snack ")
    single = input()
    if single == "S" or single == "s":
        print(snack.popleft())
        if not snack:
            print("no snack exist")
            break
        else:
            print("remaining", snack)
    else:
        print("invalid input")