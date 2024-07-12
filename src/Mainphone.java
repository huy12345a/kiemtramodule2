public class Mainphone extends  Phone{
    private String warrantyperiod;
    private String wanrantscope;

    public Mainphone(int id, String name, String prime, String quantity, String manufacture,String warrantyperiod, String wanrantscope) {
        super(id, name, prime, quantity, manufacture);
        this.warrantyperiod = warrantyperiod;
        this.wanrantscope = wanrantscope;
    }

    public String getWarrantyperiod() {
        return warrantyperiod;
    }

    public void setWarrantyperiod(String warrantyperiod) {
        this.warrantyperiod = warrantyperiod;
    }

    public String getWanrantscope() {
        return wanrantscope;
    }

    public void setWanrantscope(String wanrantscope) {
        this.wanrantscope = wanrantscope;
    }
    public String toString() {
        return super.toString() +" "+ warrantyperiod +" "+ wanrantscope;
    }
}
