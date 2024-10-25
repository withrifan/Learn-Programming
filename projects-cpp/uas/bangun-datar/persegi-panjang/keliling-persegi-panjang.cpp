#include <iostream>
using namespace std;

int main()
{
    int p, l, hasil;

    cout << "Masukkan nilai panjang : ";
    cin >> p;
    cout << "Masukkan nilai lebar : ";
    cin >> l;
    hasil = (2 * p) + (2 * l) + 2 * (p + l);
    cout << "Rumus keliling persegi panjang : K = (2*p) + (2*l) + 2*(p+l)" << endl;
    cout << "Hasil dari keliling persegi panjang : " << hasil << endl;

    return 0;
}