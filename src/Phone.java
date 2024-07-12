public class Phone {
    private int id;
    private String name;
    private String prime;
    private String quantity;
    private String manufacture;
    public Phone(int id, String name, String prime, String quantity, String manfacture) {
        this.id = id;
        this.name = name;
        this.prime = prime;
        this.quantity = quantity;
        this.manufacture = manfacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manfacture) {
        this.manufacture = manfacture;
    }
    public String toString() {
        return id + " " + name + " " + prime + " " + quantity + " " + manufacture;
    }
}
