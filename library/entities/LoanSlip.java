package library.entities;


import library.data.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanSlip {
    private int id;
    private int autoID;
    private int bookId;
    private String nameofBook;
    private int readerId;
    private LocalDateTime borrowedDate;
    private  LocalDate paymentDate;

    public LoanSlip(int bookId, String nameofBook, int readerId, LocalDateTime borrowedDate, LocalDate paymentDate) {
        this.id = ++autoID;
        this.bookId = bookId;
        this.readerId = readerId;
        this.nameofBook = nameofBook;
        this.borrowedDate = borrowedDate;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return ++autoID;
    }
    public Book getBook(int id){

        return Data.books.get(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getNameofBook() {
        return nameofBook;
    }

    public void setNameofBook(String nameofBook) {
        this.nameofBook = nameofBook;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public LocalDateTime getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDateTime borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
