
import java.util.Scanner;
//ove e 4ta zadaca
public class CetvrtaZadaca {

	public static void main(String[] args) {
		int k;
		
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Vnesete ja vrednosta na k");
		
	     k=(int) tastatura.nextDouble();
	    		
		if(k<6) {
			System.out.println("Ova e eror");
		}
		else {
		System.out.println("k= "+k);
		}
	}
}