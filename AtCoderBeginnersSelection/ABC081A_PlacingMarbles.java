import java.util.Scanner;

public class ABC081A_PlacingMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] charArray = str.toCharArray();

        int sum = 0;
        for (char c : charArray) {
            //System.out.println(c);
            if(c=='1'){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
