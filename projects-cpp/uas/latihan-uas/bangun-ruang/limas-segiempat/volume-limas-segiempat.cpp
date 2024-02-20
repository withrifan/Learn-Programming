#include <iostream>
using namespace std;

int main()
{
    double s, t, hasil;
    cout << "Masukkan nilai sisi : ";
    cin >> s;
    cout << "Masukkan nilai tinggi : ";
    cin >> t;

    hasil = ((s * s) * t) / 3;
    cout << "Rumus volume limas segiempat V = ((s * s) * t) / 3 (1/3 * luasalas * tinggi)" << endl;
    cout << "Hasil volume limas segiempat : " << hasil << endl;

    return 0;
}