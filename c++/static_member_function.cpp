#include<iostream>
using namespace std;

class  test{
    int code;
    static int count;
    public:
    void set_code(){
        code= ++count;{                      
            
                         
            }
        }

        void show_code(){
                cout<<"object member : "<<code;
    }
    static void show_count(){
                cout<<"count : "<<count; 
}
};

int test::count;
int main(){
    test t1,t2;

    t1.set_code();
    t2.set_code();

    test show_count();
    test t3;
    t3.set_code();

    test::show_count();

    t1.show_code();
    t2.show_code();
    t3.show_code();

    return 0;

}
