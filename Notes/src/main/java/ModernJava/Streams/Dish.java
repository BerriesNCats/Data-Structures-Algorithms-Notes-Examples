package ModernJava.Streams;

public class Dish {
  public enum Type {
    MEAT,
    FISH,
    OTHER
  }

  private final String name;
  private final boolean vegetarian;
  private final int calories;
  private final Type type;

  public Dish(String name, boolean vegetarian, int calories, Type type) {
    this.name = name;
    this.vegetarian = vegetarian;
    this.calories = calories;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public boolean isVegetarian() {
    return this.vegetarian;
  }

  public int getCalories() {
    return this.calories;
  }

  public Type getType() {
    return this.type;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
