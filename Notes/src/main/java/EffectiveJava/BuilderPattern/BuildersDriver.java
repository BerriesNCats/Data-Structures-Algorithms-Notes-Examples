package EffectiveJava.BuilderPattern;

public class BuildersDriver {

    public static void main(String[] args) {
        NutritionFacts cocaColaNutritionFacts = new NutritionFacts.NutritionFactsBuilder(240, 9)
                .calories(100).sodium(35).carbohydrate(39).build();

        System.out.println(cocaColaNutritionFacts.toString());

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.MUSHROOM).build();

        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();

        System.out.println(nyPizza.toString());
        System.out.println(calzone.toString());

    }
}
