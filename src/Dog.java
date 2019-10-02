package HealthyPets;

public class Dog extends Animal {

    public Dog(String name, int weightGrams) {
        super(name, weightGrams);
    }

    @Override
    public double getPortionSize() {
        return Math.round(this.getWeightGrams() / 100);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.HUNDMAT;
    }
}
