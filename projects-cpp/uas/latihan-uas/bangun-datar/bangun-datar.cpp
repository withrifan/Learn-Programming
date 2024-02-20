#include <iostream>
using namespace std;

int main()
{

    double alas, panjang, lebar, tinggi, r, sisi, sisiAtas, sisiBawah, d1, d2, luas;
    string choice;
    const double phi = 3.14;
    cout << "Kalkulator menghitung luas bangun datar" << endl;
    cout << "Silahkan pilih bangun datarnya : " << endl;
    cout << "1) persegi" << endl;
    cout << "2) persegi panjang" << endl;
    cout << "3) segitiga" << endl;
    cout << "4) lingkaran" << endl;
    cout << "5) jajar genjang" << endl;
    cout << "6) layang layang" << endl;
    cout << "7) belah ketupat" << endl;
    cout << "Pilihan anda adalah : ";
    cin >> choice;

    if (choice == "1" || choice == "persegi")
    {
        cout << "Masukkan sisi persegi : ";
        cin >> sisi;
        luas = sisi * sisi;
        cout << "Rumus luas persegi : L = sisi x sisi" << endl;
    }
    else if (choice == "2" || choice == "persegi panjang")
    {
        cout << "Masukkan nilai panjang : ";
        cin >> panjang;
        cout << "Masukkan nilai lebar : ";
        cin >> lebar;
        luas = panjang * lebar;
        cout << "Rumus luas persegi panjang : L = panjang x lebar" << endl;
    }
    if (choice == "3" || choice == "segitiga")
    {
        cout << "Masukkan nilai alas : ";
        cin >> alas;
        cout << "Masukkan nilai tinggi : ";
        cin >> tinggi;
        luas = 0.5 * alas * tinggi;
        cout << "Rumus luas segitiga : L = 0.5 * alas * tinggi" << endl;
    }
    else if (choice == "4" || choice == "lingkaran")
    {
        cout << "Masukkan nilai panjang : ";
        cin >> panjang;
        cout << "Masukkan nilai lebar : ";
        cin >> lebar;
        luas = panjang * lebar;
        cout << "Rumus luas persegi panjang : L = panjang x lebar" << endl;
    }
    else
    {
        cout << "tidak ada" << endl;
    }

    cout << "Hasil dari luas bangun datar : " << luas << endl;
    return 0;
}