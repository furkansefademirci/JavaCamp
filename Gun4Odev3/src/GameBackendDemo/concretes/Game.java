package GameBackendDemo.concretes;

public class Game {
    private String name;
    private int price;
    private String company;
    private String key;

    public Game(String name, int price, String company,String key) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
