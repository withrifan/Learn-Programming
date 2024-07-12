print("============= DAFTAR MENU =============")
print("1. Konversi Bilangan Desimal ke Biner")
print("2. Konversi Bilangan Biner ke Desimal")
print("3. Konversi Bilangan Desimal ke Oktal")
print("4. Konversi Bilangan Oktal ke Desimal")
print("========================================\n")

pilihan = int(input("Pilihan Anda (1/2/3/4) : "))
print(" ")

if (pilihan == 1):
    print("KONVERSI BIL DESIMAL KE BINER")
    desimalbin = int(input("Masukkan Angka Desimal : "))
    des_to_bin = bin(desimalbin)
    print(" ")
    print("Hasil Angka Biner :", des_to_bin[2:])
elif (pilihan == 2):
    print("KONVERSI BIL BINER KE DESIMAL")
    biner = input("Masukkan Angka Biner : ")
    bin_to_des = int(biner, 2)
    print(" ")
    print("Hasil Angka Desimal :", bin_to_des)
elif (pilihan == 3):
    print("KONVERSI BIL DESIMAL KE OKTAL")
    desimaloct = int(input("Masukkan Angka Desimal : "))
    des_to_oct = oct(desimaloct)
    print(" ")
    print("Hasil Angka Oktal :", des_to_oct[2:])
elif (pilihan == 4):
    print("KONVERSI BIL OKTAL KE DESIMAL")
    oktal = input("Masukkan Angka OKTAL : ")
    oct_to_des = int(oktal, 8)
    print(" ")
    print("Hasil Angka Desimal :", oct_to_des)
else:
    print("Angka yang Anda masukkan salah!")