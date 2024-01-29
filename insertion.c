// #include<conio.h>
#include<stdio.h>

int main()
{
    int a[100];
    int size,i,pos,value;
// clrscr();

 printf("ENTER THE NUMBER OF ELEMENTS :");
 scanf("%d",&size);
 
printf("ENTER %d ELEMENTS: ",size);
for(i=0;i<=size-1;i++)
{   
      scanf("\n%d",&a[i]);
}
printf("\nENTER THE POSITION WHERE YOU WANT TO INSERT THE ELEMENT : ");
scanf("%d",&pos);

printf("\nENTER THE VALUE YOU WANT TO INSERT IN THE ARRAY : ");
scanf("%d",&value);

for(i=size-1;i>=pos-1;i--)
{
    a[pos-1]=value;
}
    printf("\nTHE FINAL ARRAY IS : ");
    
    for(i=0;i<=size;i++)
    {
        printf("\n%d",a[i]);
    }
}