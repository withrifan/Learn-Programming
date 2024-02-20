#include <iostream>
using namespace std;
int main()
{
    char username[6];
    char password[6];

    cout << "masukkan username : ";
    cin >> username;
    cout << "masukkan password : ";
    cin >> password;

    if (username == "admin" && password == "admin")
    {
        cout << "anda admin" << endl;
    }

    return 0;
}