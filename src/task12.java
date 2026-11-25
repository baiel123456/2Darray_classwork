import java.util.Arrays;
import java.util.Scanner;

class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student=3;
        int score=4;
        double average=0;

        double[][] grades={
                {85.5,90.0,78.0,92.5},
                {70.0,65.5,88.0,80.0},
                {95.0,98.0,91.0,87.5}
        };
        double max=grades[0][0];
        double totalsum=0;
        for(int i=0;i<student;i++)
        {
            double sum=0;
            for (int j=0;j<score;j++)
                {
                sum+=grades[i][j];
                if (grades[i][j]>max){
                    max=grades[i][j];
                }
                }
            totalsum+=sum;

            System.out.printf("Student %d average: %.2f%n", i + 1, sum / score);



        }
        average=totalsum/(student*score);
        System.out.println("Class average: "+average);
        System.out.println("Class max: "+max);



    }}