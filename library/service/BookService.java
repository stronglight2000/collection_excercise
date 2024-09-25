package library.service;


import library.data.Data;
import library.entities.Book;
import library.utils.Utils;

import java.util.Scanner;

public class BookService {
    public Book createBook(Scanner scanner){
        System.out.println("Mời bạn nhập thông tin sách");
        System.out.println("Mời bạn nhập tên sách:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập chủ đề của sách ");
        String topic = scanner.nextLine();
        System.out.println("Mời bạn nhập tác giả của sách");
        String author = scanner.nextLine();
        System.out.println("Mời bạn nhập số lượng:");
        int quantity = Utils.inputInteger(scanner);
        Book book = new Book(name,topic,author,quantity);
        return book;
    }
    public void updateBook(Scanner scanner){
        Book existedBook = findBookbyId(scanner);
        if(existedBook!= null){
            System.out.println("Nhập tên sách cần sửa:");
            String bookname = scanner.nextLine();
            existedBook.setName(bookname);
            System.out.println("Nhập chủ đề của sách cần sửa:");
            String topicBook = scanner.nextLine();
            existedBook.setTopic(topicBook);
            System.out.println("Nhập tác giá của sách:");
            String author = scanner.nextLine();
            existedBook.setAuthor(author);
            System.out.println("Nhập số lượng cần cập nhật");
            int quantity = Integer.parseInt(scanner.nextLine());
            existedBook.setQuantity(quantity);
            System.out.println("Cập nhật thành công");
        }
    }
    public void removeBook(Scanner scanner){
        Book existedBook = findBookbyId(scanner);
        if(existedBook!= null){
           Data.books.remove(existedBook);
        }
    }
    public Book findBookbyId(Scanner scanner){
        System.out.println("Mời bạn nhập id cuốn sách cần sửa:");
        int id = Utils.inputInteger(scanner);
        for (Book book: Data.books) {
            if(id == book.getId()){
                return book;
            }
        }
        return null;
    }
}
