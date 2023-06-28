#include <iostream>
#include <vector>
using namespace std;

int main() {
    int arr[5] = {1, 2, 3, 4, 5};

    // Accessing an element beyond the array bounds
    cout << arr[500] << endl;  // Undefined behavior in C++
    
    vector<int>u(50,false);
    cout<<u[1]<<" "<<endl;
    cout<<u.at(500)<<endl;
    return 0;
}
