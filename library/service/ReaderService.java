package library.service;


import library.data.Data;
import library.entities.Reader;
import library.utils.Utils;

import java.util.Scanner;

public class ReaderService {
    public Reader createReader(Scanner scanner){
        System.out.println("Mời bạn nhập thông tin của người đọc");
        System.out.println("Mời bạn nhập tên của người đọc");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập số điện thoại của người đọc:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập địa chỉ của người đọc");
        String address = scanner.nextLine();
        Reader reader = new Reader(name,number,address);
        return reader;
    }
    public void updateReader(Scanner scanner){
        Reader existedReader = findReaderbyId(scanner);
        if(existedReader!= null){
            System.out.println("Nhập tên người đọc:");
            String name = scanner.nextLine();
            existedReader.setName(name);
            System.out.println("Nhập địa chỉ cần sửa:");
            String address = scanner.nextLine();
            existedReader.setAddress(address);
            System.out.println("Nhập số điện thoại");
            int number = Integer.parseInt(scanner.nextLine());
            existedReader.setNumber(number);
            System.out.println("Cập nhật thành công");
        }
    }
    public void removeReader(Scanner scanner){
        Reader existedReader = findReaderbyId(scanner);
        if(existedReader!= null){
            Data.books.remove(existedReader);
        }
    }
    public Reader findReaderbyId(Scanner scanner){
        System.out.println("Mời bạn nhập id của người đọc cần sửa:");
        int id = Utils.inputInteger(scanner);
        for (Reader reader: Data.readers) {
            if(id == reader.getId()){
                return reader;
            }
        }
        return null;
    }
}
