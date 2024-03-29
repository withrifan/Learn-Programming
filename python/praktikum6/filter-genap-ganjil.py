list_angka = (1, 2, 3, 4, 5, 6, 7, 8, 9)

# Menginisialisasi jumlah awal bil genap & ganjil
jumlah_genap = 0
jumlah_ganjil = 0

# Mengambil nilai angka dari list_angka & menghitung jumlah bil genap dan ganjil
for angka in list_angka:
    if (angka % 2 == 0):
        jumlah_genap += 1
    else:
        jumlah_ganjil += 1

# Menampilkan output
print("list angka,", list_angka)
print("Jumlah bilangan genap :", jumlah_genap)
print("Jumlah bilangan ganjil :", jumlah_ganjil)


