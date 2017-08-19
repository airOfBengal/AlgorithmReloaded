import java.util.Scanner;

class Uva11875 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt();
        for(int i=1;i<=t;i++){
            int n = inp.nextInt();
            String[] a = inp.nextLine().trim().split(" ");
            System.out.println("Case "+i+": "+a[n/2]);
        }
    }
}
