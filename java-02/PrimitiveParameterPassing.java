class CustomerOne {
	public static void main(String[] args) {
		PizzaFactory pizzaHouse = new PizzaFactory();
		int pricePrPizza = 15;
		double totPrice = pizzaHouse.calcPrice(4, pricePrPizza);
		System.out.println("Value of pricePrPizza: " + pricePrPizza);
	}
}

class PizzaFactory {
	public double calcPrice(int numberOfPizzas, double pizzaPrice) {
		pizzaPrice = pizzaPrice / 2.0;
		return numberOfPizzas * pizzaPrice;
	}
}