//Muhammad Mehroz//
//FA20-BSE-071//
//Section B G2//
//C program to check whether a number is divisible by 5 and 11 or not//
int main(){
int Phy,Chem,Bio,Maths,Comp,total,obtain;
float percentage;
printf("enter number of phy,chem,maths,comp,bio: ");
scanf("%d,%d,%d,%d,%d",Phy,Chem,Bio,Maths,Comp);
printf("%d  obtain marks are = " Phy+Chem+Bio+Maths+Comp);
scanf("%d",&obtain);
printf("enter total marks: ");
scanf("%d",total);
printf("%f percentage is = " obtain / total *100)
scanf("%.2f",percentage);
if (percentage>= 90){
    printf("grade is A+");
}
else if (percentage>=80){
    printf("grade is A");
}
else if (percentage>=70){
    printf("grade is B+");
}
else if (percentage>=60){
    printf("grade is B");
}
else
printf("you are Fail");
return 0;

}
