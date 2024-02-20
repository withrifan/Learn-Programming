#include <iostream>
using namespace std;

int main()
{
    double a, ts, s, hasil;
    cout << "Masukkan nilai alas : ";
    cin >> a;
    cout << "Masukkan nilai tinggi segitiga : ";
    cin >> ts;
    cout << "Masukkan nilai sisi : ";
    cin >> s;

    hasil = (4 * 0.5 * a * ts) + (s * s);
    cout << "Rumus LP limas segiempat LP = (4 * 0.5 * a * t) + (s * s) / (4*luas segitiga)+(luas persegi)" << endl;
    cout << "Hasil dari LP limas segiempat : " << hasil << endl;

    return 0;
}