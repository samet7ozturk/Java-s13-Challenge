package employeeApp;

public enum Plan {
    BASIC("BASIC", 3000),
    MEDIUM("MEDIUM", 5000),
    ADVANCE("ADVANCE", 7000);


    private final String name;
    private final int price;


    Plan(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}