package TestDome;

import java.util.ArrayList;

public class ChemicalMachine {
    ArrayList<String> ingredients = new ArrayList<>();
    public void add(String chemical) {
        ingredients.add(chemical);
    }

    public void applyHeat() {
        if(ingredients.contains("GREEN") && ingredients.contains("CYAN") && ingredients.size() == 2){
            ingredients.removeAll(ingredients);
            ingredients.add("ORANGE");
        } else if(ingredients.contains("ORANGE") && ingredients.size() == 1){
            ingredients.removeAll(ingredients);
            ingredients.add("RED");
            ingredients.add("BLUE");
        } else if(ingredients.contains("GREEN") && ingredients.contains("YELLOW") && ingredients.size() == 2){
            ingredients.removeAll(ingredients);
            ingredients.add("BROWN");
        } else if(ingredients.contains("BROWN") && ingredients.size() == 1){
            ingredients.removeAll(ingredients);
            ingredients.add("MAGENTA");
        } else {
            ingredients.removeAll(ingredients);
            ingredients.add("UNKNOWN");
        }
    }

    public ArrayList<String> emptyMachine() {
        ArrayList<String> res = new ArrayList<>();
        res = (ArrayList<String>) ingredients.clone();
        ingredients.removeAll(ingredients);
        return res;
    }
    public static void main(String[] args) {
        ChemicalMachine machine = new ChemicalMachine();

        machine.add("GREEN");
        machine.add("YELLOW");
        machine.applyHeat();
        System.out.println(machine.emptyMachine()); // emptyMachine should return {"BROWN"}

        machine.add("RED");
        machine.add("YELLOW");
        machine.applyHeat();
        System.out.println(machine.emptyMachine()); // emptyMachine should return {"UNKOWN"}

    }
}

