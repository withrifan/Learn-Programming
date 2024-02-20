#include <iostream>
using namespace std;
int main()
{
    string nama;
    string jurusan;
    long harta;

    cout << "Tuliskan nama: ";
    cin >> nama;
    cout << "Tuliskan jurusan: ";
    cin >> jurusan;
    cout << "Tuliskan jumlah harta: ";
    cin >> harta;

    cout << "Hi " << nama << "\n";
    cout << "Selamat datang di jurusan " << jurusan << "\n";
    cout << "Jumlah hartaku " << harta << "\n";

    return 0;
}