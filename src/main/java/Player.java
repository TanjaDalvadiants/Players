public class Player {
    int id;
    String name;
    int strength;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }
}
