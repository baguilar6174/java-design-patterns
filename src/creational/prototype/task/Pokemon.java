package creational.prototype.task;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    String name;
    String type;
    int level;
    List<String> attacks;

    public Pokemon(String name, String type, int level, List<String> attacks) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.attacks = attacks;
    }

    public Pokemon clonePokemon() {
        return new Pokemon(this.name, this.type, this.level, new ArrayList<>(this.attacks));
    }

    public void displayInfo() {
        System.out.printf("Name: %s, Type: %s, Level %d, Attack: %s%n", this.name, this.type, this.level, String.join(" - ", this.attacks));
    }
}
