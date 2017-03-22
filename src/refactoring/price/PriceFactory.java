package refactoring.price;

public class PriceFactory {
	public static Price getPrice(int priceCode){
		Price price = null;
		switch(priceCode){
		case Price.CHILDREN:
			price = new ChildrenPrice();
			break;
		case Price.REGULAR:
			price = new RegularPrice();
			break;
		case Price.NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case Price.ADULT:
			price = new AdultPrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못 입력됨");
		}
		return price;
	}
}
