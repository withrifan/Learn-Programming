#include <iostream>
using namespace std;
int main()
{
    double a, ta, s, ts, hasil;

    cout << "Masukkan nilai alas :  ";
    cin >> a;
    cout << "Masukkan nilai tinggi alas : ";
    cin >> ta;
    cout << "Masukkan nilai sisi :  ";
    cin >> s;
    cout << "Masukkan nilai tinggi sisi : ";
    cin >> ts;

    hasil = (0.5 * a * ta) + (3 * (0.5 * s * ts));
    cout << "Rumus Lp limas segitiga Lp = (1/2 * alas * tinggialas) + (3*(1/2*sisi*tinggisisi)) / Lp = Lalas+Lsegitiga " << endl;
    cout << "Hasil dari Lp limas segitiga : " << hasil << endl;
    return 0;
}