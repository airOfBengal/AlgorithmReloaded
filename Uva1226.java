import java.util.Scanner;
import java.math.BigInteger;

class Uva1226 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());

        while(t-- > 0){
            BigInteger n = new BigInteger(sc.next());
            BigInteger p = new BigInteger(sc.next());

            System.out.println(p.mod(n).toString());
        }
    }
}
