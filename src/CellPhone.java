public class CellPhone extends Phone{
    private String country;
    private String status;

    public CellPhone(int id, String name, String prime, String quantity, String manufacture, String country, String status) {
        super(id, name, prime, quantity, manufacture);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String toString() {
        return super.toString() + " " + country + " " + status;
    }
}
