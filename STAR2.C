#include<stdio.h>
int main()
{
    int i,j,l=1;
    

    for (i=1;i<=6;++i,l=1)
    {
	for (j=1;j<=7-i;++j)
	{
	    printf(" ");
	}
	while(l !=2*i){
	  //  printf("%d",l);
	  printf("*");
	    ++l;
	}
	printf("\n");
    }
    return 0;
}
