import java.util.Scanner;
import java.math.BigInteger;

class Uva10235 {
    private static final int CERTAINTY = 10;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            BigInteger bi = BigInteger.valueOf(n);
            String r = new StringBuffer(bi.toString()).reverse().toString();
            int i = Integer.parseInt(r);
            BigInteger bir = BigInteger.valueOf(i);

            System.out.printf("%d is ",n);
            if(!bi.isProbablePrime(CERTAINTY)){
                System.out.println("not prime.");
            }else if(n != i && bir.isProbablePrime(CERTAINTY)){
                System.out.println("emirp.");
            }else {
                System.out.println("prime.");
            }
        }
    }
}

