import java.util.Arrays;
import java.util.Scanner;

class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr={
                {1,2,3},
                {-1,0,-9},
                {-3,2,99}
        };
        for(int i=0;i<arr.length;i++) {


            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]<0) {
                    arr[i][j]=0;

                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }}