package creational.prototype.task;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> pikachuAttacks = Arrays.asList("Thunderbolt", "Quick Attack", "Iron Tail", "Electro Ball");
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 25, pikachuAttacks);
        pikachu.displayInfo();

        Pokemon pikachuRecharged = pikachu.clonePokemon();
        pikachuRecharged.name = "Pikachu Recharged";
        pikachuRecharged.level = 50;
        pikachuRecharged.attacks.add("Recharged Attack");

        pikachuRecharged.displayInfo();
    }
}
