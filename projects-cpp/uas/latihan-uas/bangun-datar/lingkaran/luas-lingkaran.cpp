#include <iostream>
using namespace std;

int main()
{
    double r, d, hasil1, hasil2;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;
    cout << "Masukkan nilai d : ";
    cin >> d;
    hasil1 = phi * r * r;
    hasil2 = (phi * d * d) / 4;

    cout << "Rumus luas lingkaran L = phi * r * r" << endl;
    cout << "Hasil dari luas lingkaran : " << hasil1 << endl;
    cout << "Rumus luas lingkaran L = (phi * d * d)/4" << endl;
    cout << "Hasil dari luas lingkaran : " << hasil2 << endl;

    return 0;
}