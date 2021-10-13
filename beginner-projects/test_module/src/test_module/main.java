package test_module;


public class main {
	public static void main(String[] args) {
	    double R=2.0;    
        while(R<=1000.0) {
            System.out.println("Sqrt("+Double.toString(R)+")="+Double.toString(SquareRoot(R))); 
            R*=R;       
        }
    }
    
    public static double SquareRoot(double X) {
      double A,B,M,XN; 
      if(X==0.0) {
         return 0.0; 
      } else {
         M=1.0; 
         XN=X; 
         while(XN>=2.0) {
            XN=0.25*XN; 
            M=2.0*M; 
         }
         while(XN<0.5) {
            XN=4.0*XN; 
            M=0.5*M; 
         }
         A=XN; 
         B=1.0-XN; 
         do { 
            A=A*(1.0+0.5*B); 
            B=0.25*(3.0+B)*B*B; 
         } while(B>=1.0E-15); 
         return A*M; 
      }
	}

}
