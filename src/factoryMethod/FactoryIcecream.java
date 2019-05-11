package factoryMethod;

public class FactoryIcecream {
	public static Icecream createIcecream(String type) {
		if(type.equals("Strawberry"))
			return new Strawberry();
		else if(type.equals("Chocolate"))
			return new Chocolate();
		else if(type.equals("Durian"))
			return new Durean();
		else
			return null;
	}
}
