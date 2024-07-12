def decrypt_caesar(ciphertext, step):
  decrypt_str = ''
  for i in ciphertext:
    if i.isupper():
      if ((ord(i) - 65 - step) < 0):
        temp = 65 + ((ord(i) - 65 - step + 26) % 26) 
      else:
        temp = 65 + ((ord(i) - 65 - step) % 26) 
      decrypt_str = decrypt_str + chr(temp)                              
    elif i.islower():
      if ((ord(i) - 97 - step) < 0):
        temp = 97 + ((ord(i) - 97 - step + 26) % 26) 
      else:
        temp = 97 + ((ord(i) - 97 - step) % 26) 
      decrypt_str = decrypt_str + chr(temp)
    else:
      decrypt_str = decrypt_str + i  
 
  print("Teks Aslinya adalah:",decrypt_str)
 
ciphertext = input("Masukkan teks terenkripsi: ")
step = int(input("Masukkan berapa langkah: "))
decrypt_caesar(ciphertext,step)