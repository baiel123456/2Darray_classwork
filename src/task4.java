import java.util.Scanner;

class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even=0;
        int odd=0;
        int zero=0;
        int[][] arr=new int[3][3];
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0){
                    zero++;
                }

                else if(arr[i][j]%2==0){
                    even++;
                }
                else if(arr[i][j]%2!=0){
                    odd++;
                }

            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("Zero: "+zero);



    }}
