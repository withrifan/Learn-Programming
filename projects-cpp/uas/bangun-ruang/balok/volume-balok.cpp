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

    hasil = p * l * t;
    cout << "Rumus volume balok V = p*l*t (luas alas * tinggi)" << endl;
    cout << "Hasil dari volume balok : " << hasil << endl;
}