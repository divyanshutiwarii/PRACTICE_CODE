#include<iostream>
using namespace std;

long fact(int n){

    if (n==0){
        return 1;
    }
    else
    return(n*fact (n-1));
}
int main (){
    int num;
    cout<<"ENTER ANY POSITIVE VALUE : ";
    cin>>num;

    cout<<"FACTORIAL : "<<num<<fact(num);

    return 0;
}