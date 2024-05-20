def faktorial(nilai):
    if nilai > 0:
        hasil = 1
        for i in range(1, nilai + 1):
            hasil *= i
        print(hasil)
    else:
        print("Angka yang anda masukkan salah!")
    return

nilai = int(input("Masukkan angka yang akan di faktorialkan : "))
faktorial(nilai)