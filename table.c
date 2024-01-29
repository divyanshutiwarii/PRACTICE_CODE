#include<stdio.h>
int main()
{
    int a,b=1;
    printf("\nENTER THE NUMBER :");
    scanf("%d",&a);
    printf("\nTABLE OF %d",a);
    while(b<=10)
    {
    printf("\n%d * %d = %d",a,b,a*b);
    b++;
    }
    return 0;
}
