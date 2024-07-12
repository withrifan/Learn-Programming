plaintext = str(input("masukkan string: "))
step = int(input("masukkan berapa langkah: "))

def encrypt_caesar(plaintext, step):
    encrypt_str = ''
    for i in plaintext:
        if i.isupper():
            temp = 65 + ((ord(i) - 65 + step) % 26)
            encrypt_str = encrypt_str + chr(temp)
        elif i.islower():
            temp = 97 + ((ord(i) - 97 + step) % 26)
            encrypt_str = encrypt_str + chr(temp)
        else:
            encrypt_str = encrypt_str + i
    print("setelah dienkripsi:", encrypt_str)

print("original string:", plaintext)
encrypt_caesar(plaintext, step)