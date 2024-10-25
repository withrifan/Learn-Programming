#include <iostream>
using namespace std;

int main()
{
    double a, ts, tp, hasil;

    cout << "Masukkan nilai a : ";
    cin >> a;
    cout << "Masukkan nilai ts : ";
    cin >> ts;
    cout << "Masukkan nilai tp : ";
    cin >> tp;

    hasil = 0.5 * a * ts * tp;

    cout << "Rumus volume prisma segitiga V = 1/2 * a * tsegitiga * tprisma" << endl;
    cout << "Hasil volume prisma segitiga : " << hasil << endl;
    return 0;
}