#include<stdio.h>
void main()
{
    float a,b,c,d;
    printf("nhap chieu dai va chieu rong:");
    scanf("%f %f",&a,&b);
    c=(a+b)*2;d= a*b;
    printf("chu vi : %.2f,dien tich :%.2f",c,d);
    return(0);
}