package library.entities;

public class Reader extends Base {
    private int number;
    private String address;

    public Reader(String name, int number, String address) {
        super(name);
        this.number = number;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "Id =" + getId()+  '\'' +
                "Name =" + getName()+  '\'' +
                "number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}
