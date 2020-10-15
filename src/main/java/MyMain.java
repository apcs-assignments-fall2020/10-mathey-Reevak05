import java.util.Scanner;
import java.util.Arrays;

public class MyMain {

    public static int someMethod() {
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i<3;i++) {
            arr[i] = (int)((Math.random()*11))+10;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("largest number: "+Math.max(Math.max(arr[0], arr[1]), arr[2]));
        System.out.println("smallest number: "+Math.min(Math.min(arr[0], arr[1]), arr[2]));

    }

}


