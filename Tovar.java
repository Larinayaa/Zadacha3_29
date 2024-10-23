public class Tovar {
    private int number;
    private String name;
    private double cena;

    public Tovar(int number, String name, double cena) {
        this.number = number;
        this.name = name;
        this.cena = cena;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "\nКод товара: " + number +
                ". " + name +
                ". Цена: " + cena;
    }
}
