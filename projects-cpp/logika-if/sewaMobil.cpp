#include <iostream>
#include <string>
using namespace std;

int main()
{
    string namaMobil;
    int jumlahUnit, jumlahHari, hargaTotal, diskon, hargaBayar;

    cout << "Masukkan Nama Mobil = ";
    cin >> namaMobil;
    cout << "Masukkan Jumlah (Unit) = ";
    cin >> jumlahUnit;
    cout << "Masukkan Jumlah (Hari) = ";
    cin >> jumlahHari;
    cout << endl;
    cout << "================================\n";

    if (namaMobil == "Innova")
    {
        if (jumlahUnit >= 2)
        {
            hargaTotal = 350000 * jumlahUnit * jumlahHari;
            diskon = hargaTotal * 0.25;
            hargaBayar = hargaTotal - diskon;

            /*cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
            cout << "Diskon 25% = Rp." << diskon << endl;
            cout << "Harga Dibayar = Rp." << hargaBayar << endl;*/
        }
        else
        {
            hargaTotal = 350000 * jumlahUnit * jumlahHari;
            diskon = hargaTotal * 0;
            hargaBayar = hargaTotal - diskon;

            /*cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
            cout << "Diskon 25% = Rp." << diskon << endl;
            cout << "Harga Dibayar = Rp." << hargaBayar << endl;*/
        }
    }
    else if (namaMobil == "Pajero")
    {
        if (jumlahUnit >= 2)
        {
            hargaTotal = 450000 * jumlahUnit * jumlahHari;
            diskon = hargaTotal * 0.25;
            hargaBayar = hargaTotal - diskon;

            /*cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
            cout << "Diskon 25% = Rp." << diskon << endl;
            cout << "Harga Dibayar = Rp." << hargaBayar << endl;*/
        }
        else
        {
            hargaTotal = 450000 * jumlahUnit * jumlahHari;
            diskon = hargaTotal * 0;
            hargaBayar = hargaTotal - diskon;

            /*cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
            cout << "Diskon 25% = Rp." << diskon << endl;
            cout << "Harga Dibayar = Rp." << hargaBayar << endl;*/
        }
    }
    else if (namaMobil == "Alphard")
    {
        if (jumlahUnit >= 2)
        {
            hargaTotal = 900000 * jumlahUnit * jumlahHari;
            diskon = hargaTotal * 0.25;
            hargaBayar = hargaTotal - diskon;

            /*cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
            cout << "Diskon 25% = Rp." << diskon << endl;
            cout << "Harga Dibayar = Rp." << hargaBayar << endl;*/
        }
        else
        {
            hargaTotal = 900000 * jumlahUnit * jumlahHari;
            diskon = hargaTotal * 0;
            hargaBayar = hargaTotal - diskon;

            /*cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
            cout << "Diskon 25% = Rp." << diskon << endl;
            cout << "Harga Dibayar = Rp." << hargaBayar << endl;*/
        }
    }
    else
    {
        cout << "Nama Mobil tidak tersedia\n";
    }
    cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
    cout << "Diskon 25% = Rp." << diskon << endl;
    cout << "Harga Dibayar = Rp." << hargaBayar << endl;

    return 0;
}