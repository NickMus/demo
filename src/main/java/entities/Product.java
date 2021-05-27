package entities;

public class Product {
    int id;
    String title;
    int cost;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }


}
