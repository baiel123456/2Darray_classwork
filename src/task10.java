import java.util.Scanner;

class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum=0;
        System.out.print("Diagonal: ");

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i][i] + " ");
            sum+=arr[i][i];
        }
        System.out.println();
        System.out.println("Diagonal sum: "+sum);

    }}