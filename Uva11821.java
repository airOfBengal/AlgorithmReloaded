import java.util.Scanner;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

class Uva11821 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            List<BigDecimal> ns = new ArrayList<BigDecimal>();
            String s = "";

            while(!(s = sc.next()).equals("0")){
                ns.add(new BigDecimal(s));
            }

            BigDecimal total = BigDecimal.ZERO;
            for(BigDecimal bc : ns){
                total = total.add(bc);
            }

            System.out.println(total.stripTrailingZeros().toPlainString());
        }
    }
}
