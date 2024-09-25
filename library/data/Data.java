package library.data;

import collection.library.entities.Book;
import collection.library.entities.LoanSlip;
import collection.library.entities.Reader;
import library.entities.LoanSlip;
import library.entities.Reader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    public static List<Book> books = new ArrayList<>();
    public static List<Reader> readers = new ArrayList<library.entities.Reader>();
    public static Map<Integer, LoanSlip> loanSlips = new HashMap<Integer, library.entities.LoanSlip>();
}
