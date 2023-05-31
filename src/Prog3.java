import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Prog3 {
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        n = sc.nextInt();
        String[] strArray = new String[n];
        for(int i = 0; i < n; i++ ){
            strArray[i] = sc.nextLine();
        }
        int count = n;

        // initialize an empty ArrayList of String type
        List<String> uniqueList = new ArrayList<String>();

        // remove duplicate iterating through Arrays
        for(int index = 0; index < strArray.length; index++) {

            // check whether list contains duplicate, while iterating
            if(!uniqueList.contains(strArray[index])) {

                // if it is doesn't contains, then add to unique list
                uniqueList.add(strArray[index]);
            }
        }

        // convert unique List into Array using toArray() method
        strArray = uniqueList.toArray(new String[0]);

        System.out.println(Arrays.toString(strArray));
    }
}
