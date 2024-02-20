#include <iostream>
using namespace std;

int main()
{
    double r, hasil;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;

    hasil = 2 * phi * r;
    cout << "Rumus keliling lingkaran K = 2 * phi * r" << endl;
    cout << "Hasil  dari keliling lingkaran : " << hasil << endl;

    return 0;
}