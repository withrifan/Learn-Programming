#include <iostream>
using namespace std;

int main()
{
    double p1, p2, l1, l2, luasA, luasB, luasTotal;

    cout << "==========================================" << endl;
    cout << "PROGRAM MENGHITUNG BANGUN DATAR TIPE E" << endl;
    cout << "MENGGUNAKAN PROGRAM C++" << endl;
    cout << "==========================================" << endl;
    cout << endl;

    cout << "Masukkan nilai Panjang A : ";
    cin >> p1;
    cout << "Masukkan nilai Lebar A : ";
    cin >> l1;
    cout << "Masukkan nilai Panjang B : ";
    cin >> p2;
    cout << "Masukkan nilai Lebar B : ";
    cin >> l2;
    cout << endl;
    cout << "==========================================" << endl;
    cout << endl;

    luasA = p1 * l1;
    luasB = p2 * l2;
    luasTotal = luasB - luasA;

    cout << "Hasil Perhitungan Luas Persegi Panjang A : " << luasA << endl;
    cout << "Hasil Perhitungan Luas Persegi Panjang B : " << luasB << endl;
    cout << "Luas Bangun Datar Tipe E adalah : " << luasTotal << endl;
    return 0;
}