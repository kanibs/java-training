class CustomerTwo {
	public static void main(String[] args) {
		Pizza favoritePizza = new Pizza();
		System.out.println("Meat on pizza before baking: " + favoritePizza.meat);
		bake(favoritePizza);

		System.out.println("Meat on pizza after baking: " + favoritePizza.meat);
	}

	public static void bake(Pizza pizzaToBeBaked) {
		pizzaToBeBaked.meat = "chicken"; // Change the meat on the pizza.
		pizzaToBeBaked = null;
	}
}

class Pizza {
	String meat = "mutton";
}