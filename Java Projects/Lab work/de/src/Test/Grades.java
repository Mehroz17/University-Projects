package Test;

public class Grades {
    private int[][] grades ;
    public Grades(int [][]grades){
        this.grades = grades;
    }
    public int min(){
        int low = grades[0][0];
        for(int[] sg: grades){
            for(int g : sg){
                if(g< low)
                    low = g;
            }
        }
        return  low;
    }

    public int getMaximum()
 {
         // assume first element of grades array is largest
         int highGrade = grades[0][0];
         // loop through rows of grades array
         for (int[] studentGrades : grades)
         {
          // loop through columns of current row
        for (int grade : studentGrades)
         {
        // if grade greater than highGrade, assign it to highGrade
        if (grade > highGrade)
        highGrade = grade;
        }
        }
          return highGrade;
         }
}
