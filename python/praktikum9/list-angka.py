def hitung(awal, akhir):
    hasil = []
    for angka in range(awal, akhir):
        hasil.append(angka * angka)
    return hasil

awal = int(input("awal range: "))
akhir = int(input("akhir range sebelum: "))

hasil = hitung(awal, akhir)
print(hasil)