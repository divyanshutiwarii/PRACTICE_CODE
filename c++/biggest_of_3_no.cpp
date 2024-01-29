#include<iostream>
using namespace std;

int main()
{
    int a ,b ,c;
    cout<<"Enter three numbers :"<<endl;
    cin>>a>>b>>c;

    if(a>=b && a>=c)
    cout<<"Largest number : "<<a<<endl;

    if(b>=a && b>=c)
    cout<<"Largest number : "<<b<<endl;

    if(c>=b && c>=a)
    cout<<"Largest number : "<<c<<endl;

    return 0;
}
