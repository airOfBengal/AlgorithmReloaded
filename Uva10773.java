import java.util.Scanner;

class Uva10773 {
    private static final double ZERO = 1e-8;

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt();
        for(int i=1;i<=t;i++){
            double d = inp.nextDouble();
            double v = inp.nextDouble();
            double u = inp.nextDouble();

            if(v>=u || u <= ZERO || v <= ZERO){
                System.out.println("Case "+i+": can't determine");
            }else{
                double t1 = d/u;
                double t2 = d/Math.sqrt(u*u - v*v);

                System.out.printf("Case %d: %.3f\n",i,Math.abs(t2-t1));
            }
        }
    }
}
