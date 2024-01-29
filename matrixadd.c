#include<stdio.h>

int main()
{
    int m1[10][10],m2[10][10],m3[10][10];
    int r,c,i,j;

    printf("\nENTER THE SIZE OF MATRIX : ");
    scanf("%d %d",&r,c);

    printf("ENTER THE VALUES OF MATRIX 1 \n");
    for ( i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
            scanf("%d ",&m1[i][j]);        
        }
        
    }

    printf("\nENTER THE VALUES OF MATRIX 2\n ");
    for ( i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
            scanf("%d ",&m2[i][j]);        
        }
    }
        printf("SUM OF TWO MATRIX ARE \n");
        m3[i][j]=m1[i][j]+m2[i][j];
        for ( i = 0; i < r; i++)
        {
            for ( j = 0; j < c; j++)
            {
                printf("%d ",m3[i][j]);
            }
            
        }
             
    
    return 0;
}