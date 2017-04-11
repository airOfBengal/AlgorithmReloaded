import java.util.Scanner;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Uva389 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String num = st.nextToken();
            int baseFrom = Integer.parseInt(st.nextToken());
            int baseTo = Integer.parseInt(st.nextToken());
            long a = Long.parseLong(num,baseFrom);
            String b = Long.toString(a,baseTo);
            if(b.length() <= 7){
                System.out.printf("%7s\n",b.toUpperCase());
            }else{
                System.out.println("  ERROR");
            }
        }
    }
}
