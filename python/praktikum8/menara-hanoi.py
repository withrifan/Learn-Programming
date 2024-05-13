def cetakDisk(sumber, tujuan):
    if len(tujuan) == 1:
        print("Memindah disk dari " + sumber[0] + " ke " + tujuan[0])
        tujuan.append(sumber[-1])
        sumber.pop()
        print("Hasil = ", tiangA, tiangB, tiangC)
    elif len(sumber) == 1:
        print("Memindah disk dari " + tujuan[0] + " ke " + sumber[0])
        sumber.append(tujuan[-1])
        tujuan.pop()
        print("Hasil = ", tiangA, tiangB, tiangC)
    elif tujuan[-1] < sumber[-1]:
        print("Memindah disk dari " + tujuan[0] + " ke " + sumber[0])
        sumber.append(tujuan[-1])
        tujuan.pop()
        print("Hasil = ", tiangA, tiangB, tiangC)
    else:
        print("Memindah disk dari " + sumber[0] + " ke " + tujuan[0])
        tujuan.append(sumber[-1])
        sumber.pop()
        print("Hasil = ", tiangA, tiangB, tiangC)
    return sumber, tujuan

def pindahDisk(disks, tiangA, tiangB, tiangC):
    i = 0
    while i != pow(2, disks) - 1:
        tiangA, tiangC = cetakDisk(tiangA, tiangC)
        i += 1
        if i == pow(2, disks) - 1:
            break
        tiangA, tiangB = cetakDisk(tiangA, tiangB)
        i += 1
        if i == pow(2, disks) - 1:
            break
        tiangB, tiangC = cetakDisk(tiangB, tiangC)
        i += 1
        if i == pow(2, disks) - 1:
            break

tiangA = ['A', 6, 4, 2]
tiangB = ['B']
tiangC = ['C']
disks = 3

print("===============================================")
print("Program Python Menara Hanoi")
print("Tampilan awal : ", tiangA, tiangB, tiangC)
print("===============================================")
print("Proses memindahkan disk dari tiangA ke tiangC:\n")
pindahDisk(disks, tiangA, tiangB, tiangC)
