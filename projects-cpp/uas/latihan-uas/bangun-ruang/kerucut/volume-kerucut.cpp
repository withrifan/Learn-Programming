#include <iostream>
using namespace std;

int main()
{
    double r, t, hasil;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;
    cout << "Masukkan nilai t : ";
    cin >> t;

    hasil = (phi * r * r * t) / 3;

    cout << "Rumus volume kerucut V = (phi * r * r * t) / 3" << endl;
    cout << "Hasil V kerucut : " << hasil << endl;
    return 0;
}