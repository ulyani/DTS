import java.util.*;

public class Coba4
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
int a,b;   
        System.out.println("Bil 1:" );
        a = input.nextInt();
        System.out.println("Bil 2:" );
        b = input.nextInt();
        if (a==b){
            System.out.println("Sama!");
        }

          
    	 else if(a>b){
     
       System.out.println("lebih besar bil 1");
       
      }
      else if(b>a){
        System.out.println("lebih besar bil 2");
      }
  }
}
