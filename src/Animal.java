package HealthyPets;

/**
 * Animal är min superklass som ärver interfacet IAnimalfood. Interfacet + alla metoder som finns i Animal
 * ärvs av subklasserna.
 */

abstract class Animal implements IAnimalFood {
    /**
     * name och weightGrams är inkapslade värden, de nås endast av konstruktorer eller
     * setters och getters.
     */
    private String name;
    private double weightGrams;

    String getName() {
        return name;
    }

    double getWeightGrams() {
        return weightGrams;
    }

    public Animal(String name, int weightGrams) {
        this.name = name;
        this.weightGrams = weightGrams;
    }

    @Override
    public FoodType getFoodType() {
        return null;
    }

    @Override
    public double getPortionSize() {
        return 0;
    }
}