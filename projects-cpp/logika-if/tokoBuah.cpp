#include <iostream>
#include <string>
using namespace std;

int main()
{
    string namaBuah;
    int hargaApel = 30000;
    int hargaAnggur = 50000;
    int beratBuahApel, beratBuahAnggur, diskonApel, diskonAnggur, hargaTotalApel, hargaTotalAnggur, hargaBayarApel, hargaBayarAnggur;

    cout << "Masukkan Nama Buah = ";
    cin >> namaBuah;

    if (namaBuah == "Apel")
    {
        cout << "Masukkan Jumlah (Kg) = ";
        cin >> beratBuahApel;
        cout << endl;

        if (beratBuahApel > 5)
        {
            hargaTotalApel = beratBuahApel * hargaApel;
            diskonApel = hargaTotalApel * 0.20;
            hargaBayarApel = hargaTotalApel - diskonApel;

            cout << "Harga Total (Sebelum Diskon) = " << hargaTotalApel << endl;
            cout << "Diskon 20% = " << diskonApel << endl;
            cout << "Harga Dibayar = " << hargaBayarApel << endl;
        }
        else
        {
            hargaTotalApel = beratBuahApel * hargaApel;
            diskonApel = hargaTotalApel * 0;
            hargaBayarApel = hargaTotalApel - diskonApel;

            cout << "Harga Total (Sebelum Diskon) = " << hargaTotalApel << endl;
            cout << "Diskon 20% = " << diskonApel << endl;
            cout << "Harga Dibayar = " << hargaBayarApel << endl;
        }
    }
    else if (namaBuah == "Anggur")
    {
        cout << "Masukkan Jumlah (Kg) = ";
        cin >> beratBuahAnggur;
        cout << endl;

        if (beratBuahAnggur > 7)
        {
            hargaTotalAnggur = beratBuahAnggur * hargaAnggur;
            diskonAnggur = hargaTotalAnggur * 0.30;
            hargaBayarAnggur = hargaTotalAnggur - diskonAnggur;

            cout << "Harga Total (Sebelum Diskon) = " << hargaTotalAnggur << endl;
            cout << "Diskon 30% = " << diskonAnggur << endl;
            cout << "Harga Dibayar = " << hargaBayarAnggur << endl;
        }
        else
        {
            hargaTotalAnggur = beratBuahAnggur * hargaAnggur;
            diskonAnggur = hargaTotalAnggur * 0;
            hargaBayarAnggur = hargaTotalAnggur - diskonAnggur;

            cout << "Harga Total (Sebelum Diskon) = " << hargaTotalAnggur << endl;
            cout << "Diskon 30% = " << diskonAnggur << endl;
            cout << "Harga Dibayar = " << hargaBayarAnggur << endl;
        }
    }
    else
    {
        cout << "Buah tidak tersedia\n";
    }
}