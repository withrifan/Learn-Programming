#include <iostream>
using namespace std;

int main()
{
    int p, l, t, hasil;
    cout << "Masukkan nilai panjang : ";
    cin >> p;
    cout << "Masukkan nilai lebar : ";
    cin >> l;
    cout << "Masukkan nilai tinggi : ";
    cin >> t;

    hasil = (2 * p * l) + (2 * p * t) + (2 * l * t);
    cout << "Rumus luas balok Lp = (2*p*l)+(2*p*t)+(2*l*t)" << endl;
    cout << "Hasil dari luas balok : " << hasil << endl;
}