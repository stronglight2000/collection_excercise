package library.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utils {
    public static int inputInteger(Scanner scanner){
        do {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception e){
                System.out.println("Bạn nhập không hợp lệ vui lòng nhập vào số nguyên");
            }
        } while (true);
    }
    public static double inputDouble(Scanner scanner){
        do {
            try {
                double n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (Exception e){
                System.out.println("Bạn nhập không hợp lệ vui lòng nhập vào số thực");
            }
        } while (true);

    }
    public static LocalDate convertStringToDate(String time, String pattern){
        do {
            try {
                LocalDate birthDate = LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern));
                return birthDate;
            } catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng: "+pattern);
            }
        } while (true);
    }

}
