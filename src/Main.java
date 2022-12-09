public class Main {


    public static void main(String[] args){

        Complex[] Hmm = new Complex[10];
        double[] rm = new double[10];
        double[] den = new double[10];
        for (int i = 0; i<10;i++){
            Hmm[i] = new Complex(i,i);
            rm[i] = i;
            den[i] = 2; // denominator is 2
        }
        Polynomial div = new Polynomial(Hmm);
        System.out.println(div.sythetic_div(rm,den));
    }
    /*



    Class Complex{
        private double real;
        private double imaginary;

        complex(double read,double imag);

        public add(complex other){
            return new complex(real+other.real,imag+other.imag);
        }

        //make sub, div, multi
    }

    Class Polynomial{
        turns it into a polynomial
        complex[] coeffs;
        evaluate(complex x)
    }
    (−7(x+h)^2−7(x+h)−7) - (−7x^2−7x−7)
    (-7x^2-14xh-7h^2)-7x-7h-y +7x^2 + 7x + 7


    */

}
