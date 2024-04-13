//Muhammad Mehroz
// FA20-BSE-071
// Section B G2
#include<stdio.h>
int main(){
int weekNo;
printf("enter week number from 1 to 7");
scanf("%d",&weekNo);
if (weekNo == 1)
    printf("Monday");
else if(weekNo == 2)
    printf("Tuesday");
else if(weekNo == 3)
    printf("Wednesday");
else if (weekNo == 4)
    printf("Thursday");
else if(weekNo == 5)
    printf("Friday");
else if (weekNo == 6)
    printf("Saturday");
else if(weekNo == 7)
    printf("Sunday");
return 0 ;
}
