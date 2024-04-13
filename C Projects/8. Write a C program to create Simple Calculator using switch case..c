#include<stdio.h>
int main(){
char commands;
float N1,N2;
printf("enter any command (+,-,*,/) ");
scanf("%c",&commands);
printf("enter 2 number ");
scanf("%f %f",&N1,&N2);

switch(commands){
case'+':
printf("%.1f + %.1f  = %.1f", N1,N2, N1+N2);
break;
case '-':
printf("%0.1f - & %.1f = %.1f",N1,N2, N1-N2);
break;
case '*':
printf("%0.1f * %.1f = %.1f",N1,N2,N1*N2);
break;
case '/':
printf("%0.1f / %.1f = %.1f",N1,N2,N1/N2);
break;
default:
    printf("invalid number of command");}
return 0;}
