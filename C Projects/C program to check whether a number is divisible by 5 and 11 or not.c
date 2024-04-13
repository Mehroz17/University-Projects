//Muhammad Mehroz//
//FA20-BSE-071//
//Section B G2//
//C program to check whether a number is divisible by 5 and 11 or not//
int main(){
int N1;
printf("enter any number");
scanf("%d",&N1);
if (N1%5 == 0)
    printf("the number %d is divisible by 5 but not by 11",N1);
if (N1%11 == 0)
    printf("the number %d is divisible by 11 but not by 5",N1);


return 0;

}
