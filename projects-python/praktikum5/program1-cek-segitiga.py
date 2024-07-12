x = int(input("Masukkan nilai X = "))
y = int(input("Masukkan nilai y = "))
z = int(input("Masukkan nilai z = "))

if (x == y == z):
    print("Segitiga sama sisi, dimana memiliki nilai sisi x=",x,",y=",y,",z=",z)
elif ((x == y) or (x == z) or (y == z)):
    print("Segitiga sama kaki, dimana memiliki nilai sisi x=",x,",y=",y,",z=",z)
else:
    print("Segitiga Sembarangan, dimana memiliki nilai sisi x=",x,",y=",y,",z=",z)





    