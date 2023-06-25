import java.util.Scanner;

public class ABC087B_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin500 = sc.nextInt();
        int coin100 = sc.nextInt();
        int coin50  = sc.nextInt();
        int targetTotalAmount = sc.nextInt();
        int combinatorialCount = 0;

        for(int i=0; i<coin500+1; i++){
            for(int j=0; j<coin100+1; j++){
                for(int k=0; k<coin50+1; k++){
                    if(targetTotalAmount == 500*i + 100*j + 50*k) combinatorialCount++;
                }
            }
        }
        System.out.println(combinatorialCount);
    }
}
