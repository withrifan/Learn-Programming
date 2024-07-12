tgl = int(input("tanggal anda lahir: "))
bln = str(input("bulan anda lahir: "))

if((bln == "maret" and tgl >= 21 and tgl <= 31) or (bln == "april" and tgl >= 1 and tgl <= 19)):
    print("Astrologi anda adalah Aries")
elif((bln == "april" and tgl >= 20 and tgl <= 30) or (bln == "mei" and tgl >= 1 and tgl <= 20)):
    print("Astrologi anda adalah Taurus")
elif((bln == "mei" and tgl >= 21 and tgl <= 31) or (bln == "juni" and tgl >= 1 and tgl <= 20)):
    print("Astrologi anda adalah Gemini")
elif((bln == "juni" and tgl >= 21 and tgl <= 30) or (bln == "juli" and tgl >= 1 and tgl <= 22)):
    print("Astrologi anda adalah Cancer")
elif((bln == "juli" and tgl >= 23 and tgl <= 31) or (bln == "agustus" and tgl >= 1 and tgl <= 22)):
    print("Astrologi anda adalah Leo")
elif((bln == "agustus" and tgl >= 23 and tgl <= 31) or (bln == "september" and tgl >= 1 and tgl <= 22)):
    print("Astrologi anda adalah Virgo")
elif((bln == "september" and tgl >= 23 and tgl <= 30) or (bln == "oktober" and tgl >= 1 and tgl <= 22)):
    print("Astrologi anda adalah Libra")
elif((bln == "oktober" and tgl >= 23 and tgl <= 31) or (bln == "november" and tgl >= 1 and tgl <= 21)):
    print("Astrologi anda adalah Scorpio")
elif((bln == "november" and tgl >= 22 and tgl <= 30) or (bln == "desember" and tgl >= 1 and tgl <= 21)):
    print("Astrologi anda adalah Sagitarius")
elif((bln == "desember" and tgl >= 22 and tgl <= 31) or (bln == "januari" and tgl >= 1 and tgl <= 19)):
    print("Astrologi anda adalah Capricorn")
elif((bln == "januari" and tgl >= 20 and tgl <= 31) or (bln == "februari" and tgl >= 1 and tgl <= 18)):
    print("Astrologi anda adalah Aquarius")
elif((bln == "februari" and tgl >= 19 and tgl <= 29) or (bln == "maret" and tgl >= 1 and tgl <= 20)):
    print("Astrologi anda adalah Pisces")
else:
    print("Zodiak anda tidak diketahui atau input yang dimasukkan salah")




    