a = "Hello, World!"
print("original string:", a)
print("lowercase string:", a.lower())
print("uppercase string:", a.upper())

kalimat = str(input("original string: "))
for huruf in "aeo":
    kalimat = kalimat.replace(huruf, "i")

print("menggantikan karakter a,o,e menjadi i :", kalimat)




