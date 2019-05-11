package factoryMethod;

public class MainIcecreamFactory {
	public static void main(String[] args) {
		
		Icecream icecream1 = FactoryIcecream.createIcecream("Chocolate");
		icecream1.flavor();
		
		System.out.println("_______________________________________________");
		
		Icecream icecream2 = FactoryIcecream.createIcecream("Durian");
		icecream2.flavor();
		
		System.out.println("_______________________________________________");
		
		Icecream icecream3 = FactoryIcecream.createIcecream("Strawberry");
		icecream3.flavor();
		
		System.out.println("_______________________________________________");
		
		
	}
}
