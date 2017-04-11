import java.util.Scanner;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

class Uva424 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<BigInteger> ns = new ArrayList<BigInteger>();
        
        String s = "";
        while(!(s = sc.next()).equals("0")){
            ns.add(new BigInteger(s));
        }

        BigInteger total = BigInteger.ZERO;
        for(BigInteger bi : ns){
            total = total.add(bi);
        }

        System.out.println(total.toString());
    }
}
