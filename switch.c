#include<stdio.h>
int main(){
    int x,a,b;

    printf("ENTER FIRST NUMBER :");
    scanf("%d",&a);
    printf("\nENTER SECOND NUMBER :");
    scanf("%d",&b);

    printf("Enter 1 for ADDITION");
    printf("\nEnter 2 for SUBTRACTION");
    printf("\nEnter 3 for MULTIPLICATION");
    printf("\nEnter 4 for DIVISION");

    printf("\nEnter your choice:");
    scanf("%d",&x);
    
    switch(x){
        case 1:
        printf("%d + %d = %d",a,b,a+b);
        break;
        case 2:
        printf("%d - %d = %d",a,b,a-b);
        break;
        case 3:
        printf("%d * %d = %d",a,b,a*b);
        break;
        case 4:
        printf("%d / %d = %d",a,b,a/b);
        break;
        default:
        printf("invalid input");
        break;

    }

        return 0;
}