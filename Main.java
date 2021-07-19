import java.util.Scanner;
class Main {
  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
	
	int dakika =scan.nextInt();
	
	int yıl = dakika/525600;
	int gün = (dakika/1440) - (yıl*365);
	
	System.out.println(dakika + " dakika yaklasik " + yıl +" yil " + gün + " gundur" );
 
 
   }
}