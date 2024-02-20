#include <iostream>
#include <string>
using namespace std;

int main()
{
    string namaMotor;
    int jumlahUnit, hargaTotal, diskon, hargaBayar;

    cout << "Masukkan Nama Motor = ";
    cin >> namaMotor;
    cout << "Masukkan Jumlah (Unit) = ";
    cin >> jumlahUnit;
    cout << endl;
    cout << "========================================\n";

    if (namaMotor == "Scoopy")
    {
        hargaTotal = 22000000 * jumlahUnit;
        diskon = hargaTotal * 0.15;
        hargaBayar = hargaTotal - diskon;

        cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
        cout << "Diskon 15% = Rp." << diskon << endl;
        cout << "Harga Dibayar = Rp." << hargaBayar << endl;
    }
    else if (namaMotor == "PCX")
    {
        hargaTotal = 36000000 * jumlahUnit;
        diskon = hargaTotal * 0.15;
        hargaBayar = hargaTotal - diskon;

        cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
        cout << "Diskon 15% = Rp." << diskon << endl;
        cout << "Harga Dibayar = Rp." << hargaBayar << endl;
    }
    else if (namaMotor == "Beat")
    {
        hargaTotal = 18000000 * jumlahUnit;
        diskon = hargaTotal * 0;
        hargaBayar = hargaTotal - diskon;

        cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
        cout << "Diskon 15% = Rp." << diskon << endl;
        cout << "Harga Dibayar = Rp." << hargaBayar << endl;
    }
    else if (namaMotor == "Vario")
    {
        hargaTotal = 29000000 * jumlahUnit;
        diskon = hargaTotal * 0;
        hargaBayar = hargaTotal - diskon;

        cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
        cout << "Diskon 15% = Rp." << diskon << endl;
        cout << "Harga Dibayar = Rp." << hargaBayar << endl;
    }
    else if (namaMotor == "Forza")
    {
        hargaTotal = 90000000 * jumlahUnit;
        diskon = hargaTotal * 0;
        hargaBayar = hargaTotal - diskon;

        cout << "Harga Total (Sebelum Diskon) = Rp." << hargaTotal << endl;
        cout << "Diskon 15% = Rp." << diskon << endl;
        cout << "Harga Dibayar = Rp." << hargaBayar << endl;
    }
    else
    {
        cout << "Nama motor tidak tersedia\n";
    }

    return 0;
}