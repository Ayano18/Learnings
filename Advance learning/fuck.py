from queue import PriorityQueue

prio = PriorityQueue()

prio.put(2)
prio.put(5)
prio.put(0)
prio.put(7)
prio.put(9)

while not prio.empty():
    call = prio.get()
    print(call)


map = {}
#insert
map [1] = 10
map [2] = 20
map [10] = 100
map [5] = 25
map [99] = 0
#delete
print(f"Map before edited {map}")
del map[1]
del map[5]
print()
print(f"Map after del {map}")
#replace
map[2] = [19]
print(f"Map replacement {map[2]}")
#retrieve
print(map[99])
#boolean
print("boolean: ", map[10] in map)
#retrieve all
print("lists of keys", list(map.keys()))
print("lists of values", list(map.values()))

print("\nnew line\n")
maps = {}
maps = {1:10, 100:0, 0:1}
print(maps)


print()
print()
a = set()
b = set()
a = {"a", "b", "c"}
b = {"a", "z", "c"}
print("union" + str(a | b))
print("intersection" + str(a & b))
print("difference"+ str(a - b))