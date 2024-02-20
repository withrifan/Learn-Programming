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

    hasil = phi * r * r * t;

    cout << "Rumus volume tabung V = phi * r * r * t" << endl;
    cout << "Hasil Ls tabung : " << hasil << endl;
    return 0;
}