import Book.Book;

import java.io.*;
import java.util.*;

import static Book.Book.bookToString;

public class Exercise {

    //Attribute
    private static final int ARLEN = 6;
    Book[] arbooks = new Book[ARLEN];
    File readfile = new File("E:\\Schule\\3. Klasse\\SEW\\Uebungen\\Kraus_UE9_Buchverwaltung\\readfile.csv");

    //Konstruktor
    public Exercise(String args) {

        int lines = 0;
        String[] readlines = new String[ARLEN + 1];
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(readfile));
            while ((readlines[lines] = bufferedReader.readLine()) != null) {
                lines++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't read File");
        }

        for (int h = 0; h < arbooks.length; h++) {
            arbooks[h] = Book.stringToBook(readlines[h]);
        }

        if (args.equals("6") == true) {
            part6();
        } else if (args.equals("7") == true) {
            part7();
        } else if (args.equals("8") == true) {
            part8();
        }
    }

    public void part6() {
        List<Book> arrListBooks = new ArrayList<>();

        for (int i = 0; i < arbooks.length; i++) {
            arrListBooks.add(arbooks[i]);
        }
        System.out.println("------------Unsortiert------------");
        System.out.println(arrListBooks);
        System.out.println("------------Sortiert------------");
        arrListBooks.sort(Book::compareTo);
        System.out.println(arrListBooks);
        System.out.println("------------Umgekehrte Reihenfolge------------");
        for (int j = arrListBooks.size() - 1; j > 0; j--) {
            System.out.println(arrListBooks.get(j));
        }
        writeFile();
    }

    public void part7() {
        Map<Integer, Book> hashmapBooks = new HashMap<>();
        for (int k = 0; k < arbooks.length; k++) {
            hashmapBooks.put(k, arbooks[k]);
        }
        System.out.println("------------HashMap------------");
        System.out.println(hashmapBooks);

        Map<Integer, Book> treemapBooks = new TreeMap<>();
        for (int l = 0; l < arbooks.length; l++) {
            treemapBooks.put(l, arbooks[l]);
        }
        System.out.println("------------TreeMap------------");
        System.out.println(treemapBooks);
        writeFile();

    }

    public void part8() {
        Set<Book> hashsetBooks = new HashSet<>();
        for (int m = 0; m < arbooks.length; m++) {
            hashsetBooks.add(arbooks[m]);
        }
        System.out.println("------------HashSet------------");
        System.out.println(hashsetBooks);

        Book newBook = new Book("JRR Tolkien", "Lord of the Rings", 2000000);       //neues Buch das bereits so existiert (b1)
        hashsetBooks.add(newBook);  //kann durch überschreiben der Methode equals behoben werden

        Set<Book> treesetBooks = new TreeSet<>();
        for (int n = 0; n < arbooks.length; n++) {
            treesetBooks.add(arbooks[n]);
        }
        System.out.println("------------TreeSet------------");
        System.out.println(treesetBooks);
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter fw = new FileWriter("E:\\Schule\\3. Klasse\\SEW\\Uebungen\\Kraus_UE9_Buchverwaltung\\writefile.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int g = 0; g < arbooks.length; g++) {
                bw.write(bookToString(arbooks[g]) + "\r\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Can't write File");
        }
    }
}
