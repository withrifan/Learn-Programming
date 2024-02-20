#include <iostream>
using namespace std;

int main()
{
    int NILAI_X = 0;
    int NILAI_1, NILAI_2, NILAI_3;

    cout << "Masukkan Nilai 1 : ";
    cin >> NILAI_1;
    cout << "Masukkan Nilai 2 : ";
    cin >> NILAI_2;
    cout << "Masukkan Nilai 3 : ";
    cin >> NILAI_3;

    NILAI_X = NILAI_1 + NILAI_2 + NILAI_3;
    NILAI_1 = NILAI_2 * NILAI_2;
    NILAI_2 = NILAI_X - NILAI_1;
    NILAI_3 = NILAI_2 * NILAI_1;
    NILAI_X = NILAI_X - (NILAI_3 + NILAI_2);

    cout << "Hasil akhir Nilai X adalah : " << NILAI_X << endl;

    return 0;
}
