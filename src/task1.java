import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a={
                {1,2,3},
                {4,5,6,},
                {7,8,9}
     };
//        int indI=sc.nextInt();
//        int indJ= sc.nextInt();
//        System.out.println(a[indI][indJ]);
        int max=a[0][0];
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
               }
            System.out.println();
            }


        }

//        System.out.println(max);
//        int[][] empty = new int[3][4];




    }