public class MealAdministrator {

	public static void main(String[] args) {
		System.out.printf(
				"Please note that no eggs will be served at %s, %02d:%02d.%n", Meal.BREAKFAST, Meal.BREAKFAST.getHour(),
				Meal.BREAKFAST.getMins());
		System.out.println("Meal times are as follows:");
		Meal[] meals = Meal.values();

		System.out.println("Printing the meals array");

		for(int i = 0 ; i< meals.length ; i++){
			System.out.println(meals[i]);
			System.out.println(meals[i].getHour());
			System.out.println(meals[i].getMins());
			meals[i].fun();
			System.out.println("--------------");
		}

		Meal formalDinner = Meal.valueOf("DINNER");
		System.out.println(formalDinner);
	}
}
