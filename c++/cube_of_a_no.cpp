#include<iostream>
using namespace std;

inline int cube(int a )
{
    
    return(a*a*a);
}

    int main()
{
    int a, result;
    cout<<"Enter the number : ";
    cin>>a;

    result = cube(a);
    cout<<"Cube of number a is :"<<result;
   return 0;
    }
