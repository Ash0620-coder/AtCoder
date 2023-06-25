import java.util.Scanner;

public class ABC081B_ShiftOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int operationTimes = 0;
        boolean flag = true;

        for (int i=0; i<N; i++){
            int a_N = sc.nextInt();
            arr[i] = a_N;
            if(arr[i]%2 == 1){
                flag = false;
            }
        }

        while(flag){
            for(int i=0; i<N; i++){
                arr[i] = arr[i] / 2;
                if (arr[i] % 2 == 1) {
                    flag = false;
                    break;
                }
            }
            operationTimes++;
        }
        System.out.println(operationTimes);
    }
}
