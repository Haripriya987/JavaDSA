#include<stdio.h>
int main()
{

    int a = 100;

    int b = 26;

    int c = 1;

    // Print second highest number

    if (a > b)
    {

        if (a > c)
        {

            if (b > c)

                printf("%d", b);

            else

                printf("%d", c);
        }

        else
        {
            printf("%d", a);
        }
    }
    else
    {
        if (b > c)
        {
            if (c > a)
                printf("%d", c);
            else
                printf("%d", a);
        }
        else
        {
            printf("%d", b);
        }
    }
}