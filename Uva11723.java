import java.util.Scanner;

class Uva11723 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        for(int i=1;i<=10002;i++){
            int r = inp.nextInt();
            int n = inp.nextInt();
            if(r == 0 && n == 0){
                break;
            }

            if(r/n <= 26){
                int res = r/n - 1;
                res += r%n==0?0:1;
                System.out.println("Case "+i+": "+res);
            }else{
                System.out.println("Case "+i+": impossible");
            }
        }
    }
}
