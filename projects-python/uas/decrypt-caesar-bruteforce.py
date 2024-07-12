def brute_force_caesar(ciphertext):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    ciphertext = ciphertext.lower() 
    possible_decryptions = []

    for shift in range(1, len(alphabet)):
        decrypted_text = ''
        for char in ciphertext:
            if char in alphabet:
                old_index = alphabet.index(char)
                new_index = (old_index - shift) % len(alphabet)
                decrypted_text += alphabet[new_index]
            else:
                decrypted_text += char

        possible_decryptions.append((shift, decrypted_text))
    
    return possible_decryptions

ciphertext = input("Masukkan teks terenkripsi: ")
decryptions = brute_force_caesar(ciphertext)
for shift, decryption in decryptions:
    print(f"Shift {shift}: {decryption}")
