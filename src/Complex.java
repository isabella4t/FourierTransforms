import java.lang.Math;
public class Complex {
    double real;
    double imag;

    public Complex(double _real, double _imag){
        real = _real;
        imag = _imag;
    }

    //adds complex o and existing number
    public Complex add(Complex o){
        return new Complex(real+o.real,imag+o.imag);
    }

    //subtracts o from existing number
    public Complex subtract(Complex o){
        return new Complex(real-o.real,imag-o.imag);
    }

    public Complex multiply(Complex o){
        //(a+bi)(c+di)
        double ac = real*o.real;
        double adi = real*o.imag;
        double bic = imag*o.real;
        double bidi = imag*o.imag;
        return new Complex(ac+bidi,bic+adi);
    }

    //divides existing number by o
    public Complex divide(Complex o){
        // (a+bi)/(c+di) = ((ac+bd)/c^2+d^2) + ((bc-ad)/c^2+d^2)i
        double realism = o.real*real+o.imag*imag; //real in numerator
        double imagine = imag*o.real-real*o.imag; //imaignary in numerator
        double denominator = Math.pow(o.real,2) + Math.pow(o.imag,2);
        return new Complex(realism/denominator,imagine/denominator);

    }
    //raises complex number to the kth power
    //https://socratic.org/questions/how-do-i-find-the-n-th-power-of-a-complex-number
    public Complex exp(int k) {
        double mag = Math.pow(real,2) + Math.pow(imag,2);
        double r = Math.sqrt(mag); //takes the hypotenuse
        double theta = Math.atan2(imag,real); //takes the angle
        return new Complex(r*Math.cos(theta),r*Math.sin(theta));

    }

    //k represents fraction around a circle
    //n is the int that (complex)^1 is one (full circle)
    public Complex rootOfUnity(int n, int k){
        double real = Math.cos((2*Math.PI)*(k/n));
        double imag = Math.sin((2*Math.PI)*(k/n));
        return new Complex(real,imag);
    }

    //turning array of complex numbers to give root of unity
    public Complex[] rootsOfUnity(Complex[] comp,int n,int k){
        for(int i = 0; i< comp.length;i++){
            comp[i] = rootOfUnity(n,k);
        }
        return comp;
    }

}
