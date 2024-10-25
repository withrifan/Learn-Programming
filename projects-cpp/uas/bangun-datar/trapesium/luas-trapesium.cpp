#include <iostream>
using namespace std;

int main()
{
    int a, b, t, hasil;
    cout << "Masukkan nilai a : ";
    cin >> a;
    cout << "Masukkan nilai b : ";
    cin >> b;
    cout << "Masukkan nilai t : ";
    cin >> t;

    hasil = ((a + b) / 2) * t;

    cout << "Rumus luas trapesium L = ((a + b)/2) * t" << endl;
    cout << "Hasil dari luas trapesium : " << hasil << endl;
    return 0;
}