import java.util.Scanner;

class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int[][] arr=new int[3][3];
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];

            }
        }
        System.out.print(sum);


    }}