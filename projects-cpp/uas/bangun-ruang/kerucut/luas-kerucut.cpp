#include <iostream>
using namespace std;

int main()
{
    double r, s, lSelimut, lPermukaan;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;
    cout << "Masukkan nilai s : ";
    cin >> s;

    lSelimut = phi * r * s;
    lPermukaan = (phi * r * s) + (phi * r * r);

    cout << "Rumus luas selimut kerucut Ls = phi * r * s" << endl;
    cout << "Hasil Ls kerucut : " << lSelimut << endl;
    cout << "Rumus luas permukaan kerucut Lp = (phi * r * s) + (phi * r * r)" << endl;
    cout << "Hasil Lp kerucut : " << lPermukaan << endl;
    return 0;
}