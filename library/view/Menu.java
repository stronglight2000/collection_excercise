package library.view;


import library.data.Data;
import library.entities.Book;
import library.entities.Reader;
import library.service.BookService;
import library.service.LoanSlipService;
import library.service.ReaderService;
import library.utils.Utils;

import java.util.Scanner;

public class Menu {
    public void menu(){
        System.out.println("Mời bạn lựa chọn:");
        System.out.println("1. Thêm sách");
        System.out.println("2. Sửa thông tin của sách.");
        System.out.println("3. Xóa sách");
        System.out.println("4. Thêm người đọc");
        System.out.println("5. Sửa thông tin của người đọc");
        System.out.println("6. Xóa người đọc");
        System.out.println("7. Tạo phiếu mượn sách");
        System.out.println("8. Trả sách");
    }
    public void selectMenu(Scanner scanner){
        ReaderService readerService = new ReaderService();
        BookService bookService = new BookService();
        LoanSlipService loanSlipService = new LoanSlipService();
        menu();
        int choice = Utils.inputInteger(scanner);
        switch (choice){
            case 1:
                Book book = bookService.createBook(scanner);
                Data.books.add(book);
                break;
            case 2:
                bookService.updateBook(scanner);
                break;
            case 3:
                bookService.removeBook(scanner);
                break;
            case 4:
                Reader reader = readerService.createReader(scanner);
                Data.readers.add(reader);
                break;
            case 5:
                readerService.updateReader(scanner);
                break;
            case 6:
                readerService.removeReader(scanner);
                break;
            case 7:
                loanSlipService.loanBook(scanner,book);
                break;
            case 8:
                loanSlipService.returnBook(scanner);
                break;
            case 9:
                System.exit(0);
        }
    }
}
