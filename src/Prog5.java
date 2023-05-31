import java.util.Arrays;
import java.util.Scanner;

public class Prog5 {
    public static void main(String[]args){

        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array1");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++ ){
            arr1[i] = sc.nextInt();
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the length of array2");
        m = sc1.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++ ){
            arr2[i] = sc1.nextInt();
        }
        int result[] = new int[n+m];

        System.arraycopy(arr1,0,result,0,n);
        System.arraycopy(arr2,0,result,n,m);

        System.out.println(Arrays.toString(result));

    }
}
