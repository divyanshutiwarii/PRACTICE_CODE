#include<stdio.h>

void bubblesort(int arr[],int size)
{
    
int i,j;
    for(i =  1; i <= size-1; i++)
    {
        for (j = 1; j <= size -i-1; j++)
        {
                if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
    }
    
}
int main()
{
    // int size,ele;

    // printf("ENTER THE SIZE OF THE ARRAY : ");
    // scanf("%d",&size);

    int arr[]={50,12,8,29,6,11};
    int size = sizeof(arr) / sizeof(arr[0]);
    bubblesort(arr, size);

    printf("SORTED LIST IS : ");
    for (int i = 0; i < size; i++)
    {  
        printf("%d ", arr[i]);  
    }  
      return 0;  
    }