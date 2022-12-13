public class Convolution {

    public Convolution(){}

    //periodic wrapping conditions wrap around

    //i'll use 0
/*
    public int[][] twoDimentional(int[][] kernel){
        int[][] retarray = new int[array.length][array[0].length];
        for(int i =0; i<retarray.length;i++){
            for(int j=0;j<retarray[0].length;j++){

            }
        }
    }

 */

    // F(u) = integral from -infinity to infinity * f(x)*g(u-x)dx
    //functs should be polynomials
    public int[] oneDimentional(int[] functA,int[] kernel){
        int[] kernew = new int[kernel.length];
        int acc =0;

        //ok flip the kernel here
        for(int j=kernel.length-1;j>=0;j--){
            kernew[acc++] = kernel[j];
        }

        kernel = kernew;
        //evaluate time
        int[] evalfunct = new int[kernel.length];
        for(int i = 0;i<kernel.length;i++){
            evalfunct[i] = evaluate(i,functA);
        }

        int[] retval =new int[kernel.length];

        //ok so lemme dot product by kernel
        for(int i = 0;i<kernel.length;i++){
            int dotprod = 0;
            for(int j=0;j<evalfunct.length;j++){
                int kern = 0;
                if(j+i>=kernel.length)kern=0;
                else kern= kernel[j+i];
                dotprod+= kern*evalfunct[j];
            }
            retval[i]=dotprod;
        }
        return retval;
    }

    public int evaluate(int x, int[]arr){
        int retval = 0;
        for (int k=0; k<arr.length;k++){
            retval += arr[k]*Math.pow(x,k);
        }
        return retval;
    }
}
