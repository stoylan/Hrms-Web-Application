package Entity;

public class Game {
    private int Id;
    private String name;
    private int year;
    private int price;

    public Game(int id, String name, int year, int price) {
        Id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
