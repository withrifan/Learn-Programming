#include <iostream>
using namespace std;

int main()
{
    int a, b, c, d, hasil;

    cout << "Masukkan nilai a : ";
    cin >> a;
    cout << "Masukkan nilai b : ";
    cin >> b;
    cout << "Masukkan nilai c : ";
    cin >> c;
    cout << "Masukkan nilai d : ";
    cin >> d;
    hasil = a + b + c + d;
    cout << "Rumus keliling belah ketupat : K = a + b + c + d" << endl;
    cout << "Hasil dari keliling belah ketupat : " << hasil << endl;

    return 0;
}