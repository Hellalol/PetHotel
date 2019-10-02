package HealthyPets;

public class Snake extends Animal {

    public Snake(String name, int weightGrams) {
        super(name, weightGrams);
    }

    @Override
    public double getPortionSize() {
        return 20;
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.ORMPELLETS;
    }
}
