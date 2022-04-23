import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int number[] = new int[a];

        for( int i=0 ; i<a; i++){
            int b = scanner.nextInt();
            number[i]=b;

        }
        Arrays.sort(number);

        for ( int j =0; j<a;j++){
            System.out.println(j+"번째 == "+number[j]);
        }


    }
}
