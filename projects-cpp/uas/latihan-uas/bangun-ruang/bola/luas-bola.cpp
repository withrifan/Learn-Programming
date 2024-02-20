#include <iostream>
using namespace std;
int main()
{
    double r, hasil;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;

    hasil = 4 * phi * r * r;
    cout << "Rumus luas bola L = 4 * phi * r * r " << endl;
    cout << "Hasil luas bola : " << hasil << endl;

    return 0;
}