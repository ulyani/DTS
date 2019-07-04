import java.util.*;

public class Coba3
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
	double a;
  double phi,luas,kel;   
        System.out.println("Masukkan Jari-jari:" );
        a = input.nextInt();
        phi= 3.14;
        kel = 2*phi*a;
        luas = phi*a*a;


          
	 
   System.out.println("Keliling Lingkaran :"+ kel);
   System.out.println("Luas Lingkaran :"+ luas);


   
  }
}
