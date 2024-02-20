#include <iostream>
using namespace std;
int main()
{
    double a, ta, s, tl, hasil;

    cout << "Masukkan nilai alas :  ";
    cin >> a;
    cout << "Masukkan nilai tinggi alas : ";
    cin >> ta;
    cout << "Masukkan nilai tinggi limas : ";
    cin >> tl;

    hasil = (0.5 * a * ta * tl) / 3;
    cout << "Rumus volume limas segitiga V = (1/2*a*ta*tl)/3 / V = 1/3 * Lalas * Tlimas" << endl;
    cout << "Hasil dari Volume limas segitiga : " << hasil << endl;
    return 0;
}