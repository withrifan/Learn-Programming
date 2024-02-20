#include <iostream>
using namespace std;
int main()
{
    double r, hasil;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;

    hasil = 1.33333 * phi * r * r * r;
    // hasil = ((phi * r * r * r) / 3) * 4;
    cout << "Rumus luas bola L = 4 * phi * r * r " << endl;
    cout << "Hasil luas bola : " << hasil << endl;

    return 0;
}