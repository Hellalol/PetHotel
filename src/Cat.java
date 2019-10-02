package HealthyPets;

public class Cat extends Animal {

    public Cat(String name, int weightGrams) {
        super(name, weightGrams);
    }

    @Override
    public double getPortionSize() {
        return Math.round(this.getWeightGrams() / 150);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.KATTMAT;
    }


}
