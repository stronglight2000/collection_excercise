package library.entities;

public class Book extends Base {
    private String topic;
    private String author;
    private int quantity;

    public Book(String name, String topic, String author, int quantity) {
        super(name);
        this.topic = topic;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id =" + getId()+  '\'' +
                "Name =" + getName()+  '\'' +
                "topic='" + topic + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
