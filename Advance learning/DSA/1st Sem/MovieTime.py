from collections import deque

def main():
    movies = deque()
    snacks = deque()


    for i in range(1, 4):
        movie = input(f"Enter movie {i} of 3: ")
        movies.append(movie)
    

    for i in range(1, 4):
        snack = input(f"Enter snack {i} of 3: ")
        snacks.append(snack)


    print("\nMovies to watch are:", list(movies))
    print("Snacks available are:", list(snacks))
    print()

    while snacks:
        select = input("Press S when you finish a snack: ").strip().lower()
        if select == 's':
            snacks.popleft() 
            if not snacks:
                print("No no more snacks exist na")
            else:
                print("Remaining snacks:", list(snacks))
        else:
            print("Invalid input")



main()