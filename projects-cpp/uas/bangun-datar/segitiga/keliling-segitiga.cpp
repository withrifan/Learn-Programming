#include <iostream>
using namespace std;

int main()
{
    int a, b, c, hasil;

    cout << "Masukkan nilai a : ";
    cin >> a;
    cout << "Masukkan nilai b : ";
    cin >> b;
    cout << "Masukkan nilai c : ";
    cin >> c;
    hasil = a + b + c;
    cout << "Rumus keliling segitiga : K = a + b + c" << endl;
    cout << "Hasil dari keliling segitiga : " << hasil << endl;

    return 0;
}