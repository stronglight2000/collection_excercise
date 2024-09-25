package library.service;


import library.data.Data;
import library.entities.Book;
import library.entities.LoanSlip;
import library.utils.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class LoanSlipService {

    public void loanBook(Scanner scanner, Book book){

        if(book.getQuantity() > 0){
            System.out.println("Mời bạn nhập id của sách mượn:");
            int bookId = Utils.inputInteger(scanner);
            System.out.println("Mời bạn nhập tên cuốn sách mượn:");
            String bookName = scanner.nextLine();
            System.out.println("Mời bạn nhập id của người đọc:");
            int readerId = Integer.parseInt(scanner.nextLine());
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println("Mời bạn nhập ngày trả:");
            String paymentDay = scanner.nextLine();
            LocalDate paymentDate = Utils.convertStringToDate(paymentDay,"dd/MM/yyyy");
            LoanSlip loanSlip = new LoanSlip(bookId,bookName,readerId,localDateTime,paymentDate);
            Data.loanSlips.put(loanSlip.getId(),loanSlip);
            book.setQuantity(book.getQuantity()-1);
        }
        else{
            System.out.println("Sách đã hết, bạn không thể mượn.");
        }
    }
    public void returnBook(Scanner scanner){
        System.out.println("Mời bạn nhập id của sách mượn:");
        int bookId = Utils.inputInteger(scanner);
        LoanSlip loanSlip = Data.loanSlips.get(bookId);
        if(loanSlip != null){
            Book book = loanSlip.getBook(bookId);
            book.setQuantity(book.getQuantity() + 1);
            Data.loanSlips.remove(bookId);
        }else{
            System.out.println("Không tìm thấy phiếu mượn.");
        }
    }

}
