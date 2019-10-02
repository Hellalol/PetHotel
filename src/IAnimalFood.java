package HealthyPets;

/**
 * IAnimalFood är mitt interface som ger alla klasser i mitt program två metoder
 * de behöver implementa.
 */

public interface IAnimalFood {

    double getPortionSize();

    FoodType getFoodType();
}
