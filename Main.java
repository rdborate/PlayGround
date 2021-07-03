#include<stdio.h>
int main()
{
  int a,b,c,n;
  scanf("%d",&n);
  a=n/100;
  b=n%10;
  printf("%d",a+b);
  //It returns the remainder sum of a number
  return 0;
}
