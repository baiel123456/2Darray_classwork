import java.util.Scanner;

class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();

            }

        }
        int find =sc.nextInt();
        int count=0;
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++) {
               if(arr[i][j]==find){
                   System.out.println(i+" "+j);
                   count++;

               }

           }
       }
       if(count==0){
           System.out.println("Not found");
       }



    }}
