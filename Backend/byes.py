import math

def byes(x):
  # Si es binario (2, 4, 8, 16, ...), no hay byes
  if math.log(x, 2) == int(math.log(x, 2)):
    return 0
  else:
    i = 1
    while(2**i <= x):
      i+=1
    return 2**i-x

# n lista de posibles # de equipos
n = list(range(2, 120))
print("# de Equipos", "# de Byes")
for num in n:
  print(str(num) + "\t" + str(byes(num)))