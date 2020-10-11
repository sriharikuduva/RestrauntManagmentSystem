import metadata.Address;

public class Branch {
    private String name;
    private Address location;
    private Kitchen kitchen;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }
    public void setLocation(Address location) {
        this.location = location;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}