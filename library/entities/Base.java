package library.entities;

public class Base {
    private int id;
    private static int autoId;
    private String name;

    public Base(String name) {
        this.id = ++autoId;
        this.name = name;
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

}
