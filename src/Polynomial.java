import java.lang.Math;
public class Polynomial {
    Complex[] coeffs;
//pos in array represents x to the power of pos
    public Polynomial(Complex[] _coeffs){
        coeffs = _coeffs;
    }

    //substitute x for V
    //pos is which exponent in the polynomial
    public Complex evaluate(Complex V, int pos){
        return coeffs[pos].multiply(V.exp(pos));
    }

    //polynomial array where x is substituted by complex number (V)
    public Complex[] evaluateALL(Complex V){
        Complex[] retval = new Complex[coeffs.length];
        for (int k=0; k<coeffs.length;k++){
            //substituting x for complex number
            retval[k]=evaluate(V,k);
        }
        return retval;
    }

    //makes the coeffs array of fourier transformed stuff
    public Complex[] FourierTransform(int n,int k){
        Complex[] retval = new Complex[coeffs.length];
        for(int i = 0; i< coeffs.length;i++){
            //new array of all the transformed terms
            retval[i] = coeffs[i].rootOfUnity(n,k);
        }
        return retval;
    }

    public double[] sythetic_div(double[]num, double[] den) {
        double[] retval = num.clone();
        double norm = den[0];
        for (int i = 0; i < num.length - den.length + 1; i++) {
            retval[i] = retval[i] / norm;
            double c = retval[i];
            if (c != 0) {
                for (int j = 0; j < den.length; j++) {
                    retval[i + j] -= den[j] * c;
                }
            }
        }
        return retval;
    }

    public Complex[] eveneval(int x){
        for(int i =0; i<coeffs.length;i=i+2) {
            
        }
    }

    public Complex[] oddval(int x){
        for(int i =1; i<coeffs.length;i=i+2) {

        }
    }


    //e ^(i2pik)/8
    // cos (2pik)/8 (x coord)+ i sin(2pik)/8 (y coord)

    //w 8 ^ 1 is half the unit circle away from w 8 ^5
}


