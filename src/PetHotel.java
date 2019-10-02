package HealthyPets;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PetHotel {

    public static void main(String[] args) {

        /**
         *
         */

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("Sixten", 5000));
        animalList.add(new Dog("Dogge", 10000));
        animalList.add(new Cat("Venus", 5000));
        animalList.add(new Cat("Ove", 3000));
        animalList.add(new Snake("Hypno", 1000));

        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        try {
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Namnet får ej vara numeriskt.",
                            "FEL",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }

            boolean animalFound = false;

            for (Animal animal : animalList) {
                if (animal.getName().equalsIgnoreCase(input.trim().replace(" ",""))) {
                    animalFound = true;
                    JOptionPane.showMessageDialog(
                            null,
                            (int) animal.getPortionSize()
                                    + " gram " + animal.getFoodType().toString().toLowerCase(),
                            animal.getName(),
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

            if (!animalFound) {
                JOptionPane.showMessageDialog(null, "Djuret hittades inte!");
            }

        } catch (NullPointerException e) {
            System.exit(0);
        }


    }
}