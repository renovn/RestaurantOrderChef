package models;

public class MenuItem {
    private int id;
    private String type;
    private String name;
    private String meal;
    private int price;
    private double energy;
    private double protein;
    private double carbohydrate;
    private double fat;
    private double fibre;

    public MenuItem(int id, String type, String meal, String name, int price, double energy, double protein, double carbohydrate, double fat, double fibre) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.meal = meal;
        this.price = price;
        this.energy = energy;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.fat = fat;
        this.fibre = fibre;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPrice() {
        return price;
    }

    public double getEnergy() {
        return energy;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public double getFibre() {
        return fibre;
    }

    @Override
    public String toString() {
        return name;
    }
}
