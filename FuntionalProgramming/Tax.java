package solidprinciple;

import java.util.ArrayList;

//Given a list of prices (e.g., 10.5, 20.0, 5.5), add 10% tax to each price and print the new prices.
public class Tax {
	public static void main(String[] args) {
		ArrayList<Float> price = new ArrayList<>();
		price.add(10.2f);
		price.add(20.0f);
		price.add(5.5f);
		price.stream().map(i-> (i*1.10f)).forEach(i->System.out.println(i));
	}
}
