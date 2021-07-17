package EffectiveJava.BuilderPattern;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static class NutritionFactsBuilder {

        // Required Parameters - final
        private final int servingSize;
        private final int servings;

        //Optional Parameters - not final
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        // Constructor contains the required parameters
        public NutritionFactsBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // Setters for Optional Parameters
        public NutritionFactsBuilder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public  NutritionFactsBuilder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFactsBuilder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFactsBuilder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        // Build the Object
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(NutritionFactsBuilder nutritionFactsBuilder) {
        this.servingSize = nutritionFactsBuilder.servingSize;
        this.servings = nutritionFactsBuilder.servings;
        this.calories = nutritionFactsBuilder.calories;
        this.fat = nutritionFactsBuilder.fat;
        this.sodium = nutritionFactsBuilder.sodium;
        this.carbohydrate = nutritionFactsBuilder.carbohydrate;
    }

}
