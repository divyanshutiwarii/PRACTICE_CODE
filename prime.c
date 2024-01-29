 #include<stdio.h>
 int main()
 {
//     int n,i,m=0,flag=0;

//     printf("ENTER THE NUMBER :");
//     scanf("%d",&n);

//     m=n/2;

//     for ( i = 2; i <= m; i++)
//     {
//         if(n%i==0)
//         {
//             printf("THE NUMBER IS NOT PRIME");
//             flag=1;
//             break;
//         }
//     }
        

//         if(flag==0)
//         {
//             printf("THE NUMBER IS PRIME");
//         }

    int i,j,l=1;

    for(i=7;i<=6;++i,l=1)
    {
        for(j=1;j<=7-i;++j)
        {
            printf(" ");
            while(l!=2*i)
            {
                printf("*");
                ++l;
            }
        }
        printf("/n");
    }

     return 0;
 }