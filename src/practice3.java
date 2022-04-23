import java.util.Arrays;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int result = 0;

        if(number > 100){
            System.out.println("100 이하로 입력해주세요");

        }


       String str = sc.next();
       char[] cNum = str.toCharArray();



       for( int i =0 ; i<cNum.length;i++){
            result += cNum[i] - '0';

       }


        System.out.println(Arrays.toString(cNum));
        System.out.println("결과는= "+result);

    }


}
