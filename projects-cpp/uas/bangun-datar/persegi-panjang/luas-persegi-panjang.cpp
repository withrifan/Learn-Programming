#include <iostream>
using namespace std;

int main()
{
    int p, l, hasil;

    cout << "Masukkan nilai panjang : ";
    cin >> p;
    cout << "Masukkan nilai lebar : ";
    cin >> l;
    hasil = p * l;
    cout << "Rumus luas persegi panjang : L = p x l" << endl;
    cout << "Hasil dari luas persegi panjang : " << hasil << endl;

    return 0;
}