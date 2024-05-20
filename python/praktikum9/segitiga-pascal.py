def pascal(angka):
    segitiga = []

    for x in range(angka):
        baris = [1] * (x + 1) 
        if x > 1: 
            for y in range(1, x):
                baris[y] = segitiga[x - 1][y - 1] + segitiga[x - 1][y]
        segitiga.append(baris)
    
    for baris in segitiga:
        print(baris)

angka = int(input("Input angka: "))
pascal(angka)