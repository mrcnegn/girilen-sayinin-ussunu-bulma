import java.util.Scanner;
public class giriliensayininussunubulma {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int a,b,i=1,total=1;

		    System.out.println("bir say� giriniz: ");
		    a = input.nextInt();
		    
		    System.out.println("�ss� giriniz: ");
		    b = input.nextInt();
		  
		    for(;i<=b;i++) {
		    	
		    	total*=a;
		    }
			System.out.println("say�: " + total);
		    
		    
		  }
		}

	
