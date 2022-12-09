public class Main {


    public static void main(String[] args) {

        Complex[] Hmm = new Complex[10];
        double[] rm = new double[10];
        double[] den = new double[10];
        for (int i = 0; i < 10; i++) {
            Hmm[i] = new Complex(i, i);
            rm[i] = i;
            den[i] = 2; // denominator is 2
        }
        Polynomial div = new Polynomial(Hmm);
        System.out.println(div.sythetic_div(rm, den));
    }
}

