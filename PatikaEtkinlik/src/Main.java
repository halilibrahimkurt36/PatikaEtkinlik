import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double temperature;
		Scanner giris=new Scanner(System.in);
		
		System.out.println("Lütfen Hava Sıcaklığını Giriniz : ");
		temperature=giris.nextDouble();
		
		if(temperature<5) {
			System.out.println("Size Önereceğimiz Etkinlik KAYAK");
		}
		else if(temperature>=5 && temperature<25) {
			if(temperature>=5 && temperature <10) {
			System.out.println("Size Önereceğimiz Etkinlik SİNEMA");
		}
			else if(temperature>10 && temperature<=15) {
				System.out.println("Size Önereceğimiz Etkinlik SİNEMA veya PİKNİK");
			}
		else if(temperature>15 && temperature<25) {
			System.out.println("Size Önereceğimiz Etkinlik PİKNİK");
		}
		}
		else  {
			System.out.println("Size Önereceğimiz Etkinlik YÜZME");
		}

	}

}
