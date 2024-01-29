#include<iostream>
using namespace std;

int glo = 6;
void sum(){
    int a;
    cout<<glo;
}

int main(){
    int glo = 54;
    glo = 5;

    int a = 16;
    float b = 2.56;
    char c = 'd';
    double d = 1.4547654;
    bool e = false;

        // cout<<"The value of a is : "<<a<<endl;
        // cout<<"The value of b is : "<<b<<endl;
        // cout<<"The value of c is : "<<c<<endl;
        // cout<<"The value of d is : "<<d<<endl;
        // cout<<"The value of e is : "<<e<<endl;
        // display sum();
        sum();       
        cout<<glo;


    return 0;
}