import java.util.Scanner;

public class ArraysRevrse {
    public static  void printArray(int arr[][]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int r = sc.nextInt();
        System.out.println("Enter coloumn ");
        int c = sc.nextInt();
        System.out.println("Enter size of an array : ");
        int [] [] arr = new int [r][c];
        int total = r*c;
        System.out.println("Enter "+total+"Element of an array   ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Our Two D arrays:  ");
        printArray(arr);
        sc.close();
    }
}
