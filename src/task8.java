import java.util.Scanner;

class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int count=0;

        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(num<arr[i][j]){
                    count++;

                }
            }
        }
        System.out.println(count);


    }}