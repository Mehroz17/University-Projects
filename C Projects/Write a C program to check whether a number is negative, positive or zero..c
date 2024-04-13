//Muhammad Mehroz//
//FA20-BS-071//
//Section B G2//
// Programe to check weather number is positive or negative//
#include<stdio.h>
int main(){
    float N1;
    printf("enter any number: ");
    scanf("%f",&N1);
    if (N1<0.0)
        printf("the number %f is negative",N1);
    else
        printf("the number  %f is positive",N1);
    return 0 ;
}
