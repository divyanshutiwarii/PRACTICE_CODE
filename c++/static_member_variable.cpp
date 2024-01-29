#include<iostream>
using namespace std;

class item{
    static int count;
    int number;
    public:
    void getdata(int a);
    void getcount();
};

int item :: count;
void item :: getdata(int a)
{
    number = a;
    count++;   
}

void item :: getcount()
{
    cout<<"\n count="<<count;
}

int main()
{
    item a ,b ,c;
    a.getcount();
    b.getcount();
    c.getcount();
    a.getdata(100);
    b.getdata(200);
    c.getdata(300);
    a.getcount();
    b.getcount();
    c.getcount();

    return 0;
}

