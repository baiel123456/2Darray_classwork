import java.util.Scanner;

class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            int colsum=0;
            for(int j=0; j<arr[i].length; j++){

                colsum+=arr[j][i];

            }
            System.out.println("Column " + i +": "+colsum);

        }



    }}