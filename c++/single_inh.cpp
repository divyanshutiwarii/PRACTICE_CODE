#include<iostream>
using namespace std;

class student{
    public:
        int id;
        char name[20];
        void setdata()
        {
            cout<<"Enter the roll no : ";
            cin>>id;

            cout<<"\n Enter NAME : ";
            cin>>name;
        }
        void getdata()
        {
            cout<<"ROLL NO :"<<id<<endl;
            cout<<"NAME :"<<name<<endl;
        }    
};

class marks: public student
{
    public:
    int mrks;
        void set_data()
        {
            cout<<"Enter your marks : ";
            cin>>mrks;
        }
        void get_data()
        {
            cout<<"MARKS : "<<mrks;
        }
};


int main()
{
    marks m1;
    m1.setdata();
    m1.set_data();
    m1.getdata();
    m1.get_data();
    return 0;
}
