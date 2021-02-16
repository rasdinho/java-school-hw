// When working in Java, I find myself declaring utility classes to hold tuples of data (the new record feature is going to be great for that), rather than using the language support for maps offered in Groovy and Python. This is because Java encourages creating maps that map one specific type to another specific type, but in Groovy or Python, it's cool to have a map with mixed-type keys and mixed-type values.

// The first task is to define these utility classes, and the first is the Unit class:

class Unit {
    private String item, brand;
    private int price;

    public Unit(String item, String brand, int price) {
        this.item = item;
        this.brand = brand;
        this.price = price;
    }
    public String getItem() { return this.item; }
    public String getBrand() { return this.brand; }
    public int getPrice() { return this.price; }

    @Override
    public String toString() { return String.format("item: %s brand: %s price: %d",item,brand,price); }
}