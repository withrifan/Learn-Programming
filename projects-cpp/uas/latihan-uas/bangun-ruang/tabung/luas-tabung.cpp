#include <iostream>
using namespace std;

int main()
{
    double r, t, lSelimut, lPermukaan;
    const double phi = 3.14;

    cout << "Masukkan nilai r : ";
    cin >> r;
    cout << "Masukkan nilai t : ";
    cin >> t;

    lSelimut = 2 * phi * r * t;
    lPermukaan = (2 * phi * r * t) + (2 * phi * r * r);

    cout << "Rumus luas selimut tabung Ls = 2 * phi * r * t" << endl;
    cout << "Hasil Ls tabung : " << lSelimut << endl;
    cout << "Rumus luas permukaan tabung Lp = (2 * phi * r * t) + (2 * phi * r * r)" << endl;
    cout << "Hasil Lp tabung : " << lPermukaan << endl;
    return 0;
}