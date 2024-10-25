#include <iostream>
using namespace std;

int main()
{
    int a, t, hasil;
    cout << "Masukkan nilai alas : ";
    cin >> a;
    cout << "Masukkan nilai tinggi : ";
    cin >> t;
    hasil = 0.5 * a * t;
    cout << "Rumus luas segitiga : L = 1/2 * a * t" << endl;
    cout << "Hasil dari luas segitiga : " << hasil << endl;

    return 0;
}