import java.util.Scanner;
import java.math.BigInteger;

class Uva10106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());

            System.out.println(a.multiply(b));
        }
    }
}
