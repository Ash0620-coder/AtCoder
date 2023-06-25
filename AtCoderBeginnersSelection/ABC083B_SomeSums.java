import java.util.Scanner;

public class ABC083B_SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=inputN; i++){
            // 1~inputNまで走査する
            int targetNum = i;
            int eachDigitsSum = 0;

            while(targetNum>0){
                // 桁数文走査する
                eachDigitsSum += (targetNum % 10);
                targetNum /= 10;
            }
            if(inputA<=eachDigitsSum && eachDigitsSum<=inputB){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
