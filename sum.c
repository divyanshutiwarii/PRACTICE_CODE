#include<stdio.h>
int main()
{
    int a,b=0;
    
    for(a=1;a<=10;a++){
    b=a+b;
    printf("\n%d",a);
    }
    printf("\nTHE SUM IS :%d",b);

    return 0;
}
