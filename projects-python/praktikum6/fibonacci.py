# Inputan untuk jumlah bilangan yang ingin ditampilkan
jumlah_bil = int(input("Masukkan jumlah bilangan: "))
count = 0
angka1 = 1
angka2 = 1

while (count < jumlah_bil):
    print(angka1)
    bil_akhir = angka1 + angka2
    angka1 = angka2
    angka2 = bil_akhir
    count += 1

    