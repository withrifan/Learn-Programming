#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    double a, b, c, lAlas, kAlas, tPrisma, lPermukaan;

    cout << "Masukkan nilai a : ";
    cin >> a;
    cout << "Masukkan nilai b : ";
    cin >> b;
    cout << "Masukkan nilai tinggi prisma : ";
    cin >> tPrisma;

    c = (a * a) + (b * b);
    c = sqrt(c);
    lPermukaan = (2 * 0.5 * b * a) + ((a + b + c) * tPrisma);
    cout << "Rumus lpermukaan prisma segitiga Lp = (2 * lAlas) + (kAlas * tPrisma)" << endl;
    cout << "Hasil lpermukaan prisma segitiga : " << c << endl;
    cout << "Hasil lpermukaan prisma segitiga : " << lPermukaan << endl;
    return 0;
}