def hitungUpper(kalimat):
    totalUpper = 0
    for i in kalimat:
        if (i.isupper()) == True:
            totalUpper += 1
    print("Jumlah karakter uppercase pada string : ", totalUpper)
    return

def hitungLower(kalimat):
    totalLower = 0
    for i in kalimat:
        if (i.islower()) == True:
            totalLower += 1
    print("Jumlah karakter lowercase pada string : ", totalLower)
    return

kalimat = input("String Original : ")
hitungUpper(kalimat)
hitungLower(kalimat)

