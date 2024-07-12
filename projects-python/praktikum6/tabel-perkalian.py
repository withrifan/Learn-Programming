jumlah_perkalian = 10
for x in range(1, jumlah_perkalian + 1):
    for y in range(1, jumlah_perkalian + 1):
        hasil = x * y
        print("%4d " % (hasil), end="")

    print()