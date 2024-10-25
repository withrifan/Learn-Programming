#include <iostream>
using namespace std;
int main()
{
    string nama;
    string jurusan;
    double ipk;

    cout << "Tuliskan nama: ";
    cin >> nama;
    cout << "Tuliskan jurusan: ";
    cin >> jurusan;
    cout << "Tuliskan nilai ipk: ";
    cin >> ipk;

    cout << "Hi " << nama << "\n";
    cout << "Selamat datang di jurusan " << jurusan << "\n";
    cout << "Nilai IPK " << ipk << "\n";

    return 0;
}