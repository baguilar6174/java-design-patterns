package structural.decorator.task;

public interface Character {
    String getDescription();
    Stats getStats();

    class Stats {
        private  int attack;
        private int defense;

        public Stats(int attack, int defense) {
            this.attack = attack;
            this.defense = defense;
        }

        public int getAttack() {
            return attack;
        }

        public int getDefense() {
            return defense;
        }

        public void setAttack(int attack) {
            this.attack = attack;
        }

        public void setDefense(int defense) {
            this.defense = defense;
        }

        @Override
        public String toString() {
            return "Stats: { attack = " + attack + ", defense = " + defense + " }";
        }
    }
}
