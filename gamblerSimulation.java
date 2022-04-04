package G_WS;
import java.util.Random;
public class gamblerSimulation {
	public static void gamble () {
		int amount=100;
		final int bet=1;
		Random ran= new Random();
		int check= ran.nextInt(1);
			if(check==0) {
				amount=amount +bet;
	}
			else {
				amount=amount-bet;	
			}
	if(amount>100) {
		System.out.println("Gambler won");
	}else {
		System.out.println("Gambler loss");
	}
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
gamble();
}
}