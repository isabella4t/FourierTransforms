public class Main {

    static int pass =0;
    static int fail = 0;

    public static void main(String[] args){
        testadd();
        testsub();
        testdivide();
        testmultiply();
        testexpo();
        testpoly();
        testeval();
        testevalALL();
        testFouriertransform();
        testFastFourierTransform();
        testConvolutions();
    }

    public static void testadd(){
        Complex af = new Complex(2,4);
        Complex bf = new Complex(4,5);
        af.add(bf);
        System.out.println("add" + af.toString());
    }

    public static void testsub(){
        Complex af = new Complex(4,6);
        Complex bf = new Complex(4,2);
        af.subtract(bf);
        System.out.println("sub"+af.toString());
    }

    public static void testmultiply(){
        Complex af = new Complex(2,4);
        Complex bf = new Complex(4,5);
        af.multiply(bf);
        System.out.println("multiply"+af.toString());
    }

    public static void testdivide(){
        Complex af = new Complex(10,8);
        Complex bf = new Complex(2,2);
        af.divide(bf);
        System.out.println("divide"+ af.toString());
    }

    public static void testexpo(){
        Complex af = new Complex(2,4);
        af.exp(2);
        System.out.println("exponent"+af.toString());
    }

    public static void testpoly(){
        Complex[] Hmm = new Complex[10];
        double[] rm = new double[10];
        double[] den = new double[10];
        for (int i = 0; i < 10; i++) {
            Hmm[i] = new Complex(i, i);
        }
        Polynomial div = new Polynomial(Hmm);
        System.out.println("test polynomial" + div.toString());
    }

    public static void testeval(){
        Complex[] Hmm = {new Complex(2,2)};
        Polynomial me = new Polynomial(Hmm);
        //me.evaluate(new Complex(2,2),0);
        System.out.println("evaluate" + me.evaluate(new Complex(2,2),0));
    }

    public static void testevalALL(){
        Complex[] Hmm = {new Complex(4,4),new Complex(4,4),new Complex(4,4)};
        Polynomial me = new Polynomial(Hmm);
        System.out.println("evaluate all"+ me.toString(me.evaluateALL(new Complex(2,2))));
    }

    public static void testFouriertransform(){
        Complex[] Hmm = {new Complex(4,4),new Complex(4,4),new Complex(4,4)};
        Polynomial me = new Polynomial(Hmm);
        System.out.println("Fourier test"+me.toString(me.FourierTransform(2,2)));
    }


    public static void testFastFourierTransform(){
        Complex[] Hmm = {new Complex(2,2),new Complex(1,1),new Complex(4,4)};
        Polynomial me = new Polynomial(Hmm);
        System.out.println("Fast Fourier test"+me.toString(me.FastFourierTransform(2,2)));
    }

    //right now I have no idea how to combine functions but at least the dot product multiplication works
    public static void testConvolutions(){
        Convolution me = new Convolution();
        int[] funk = {8,6,1}; // or x^2 + 6x + 8
        //i evaluate my polynomial from 0 to length of kern
        int[] kern = {0,0,1,0};
        System.out.println("convolutions");
        for(int n: me.oneDimentional(funk,kern)){
            System.out.println(n);
        }

    }

    public static void testsyntheticdiv(){
        Complex[] Hmm = new Complex[10];
        double[] rm = new double[10];
        double[] den = new double[10];
        for (int i = 0; i < 10; i++) {
            Hmm[i] = new Complex(i, i);
            rm[i] = i;
            den[i] = 2; // denominator is 2
        }
        Polynomial div = new Polynomial(Hmm);
        div.sythetic_div(rm, den);
        System.out.println("synthetic"+div.toString());
    }
}

