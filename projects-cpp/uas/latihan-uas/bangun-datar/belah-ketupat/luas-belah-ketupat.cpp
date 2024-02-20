#include <iostream>
using namespace std;

int main()
{

    int d1, d2, hasil;
    cout << "Masukkan nilai d1 : ";
    cin >> d1;
    cout << "Masukkan nilai d2 : ";
    cin >> d2;

    hasil = 0.5 * d1 * d2;

    cout << "Rumus luas belah ketupat L = 1/2 * d1 * d2" << endl;
    cout << "Hasil dari luas belah ketupat : " << hasil << endl;
    return 0;
}