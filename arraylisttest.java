/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hp
 */
public class arraylisttest {

    public static void main(String args[]) {
//        int [] productName = new int[5];
        ArrayList<String> productsName = new ArrayList<String>();

        productsName.add("Projector");
        productsName.add("Excel");
        productsName.add("contigo");
        productsName.add("apple");

        productsName.add(2, "oracle");

        productsName.remove("oracle");

        if (productsName.contains("oracle")) {

            productsName.remove("oracle");

        } else {
            System.err.println("buy oracle first");
        }
        Collections.sort(productsName);
        System.out.println("===");

        for (String raman : productsName) {
            System.out.println(raman);
        }
        ArrayList<Books> library = new ArrayList<>();
        Books book1 = new Books(101, "The sky is falling", 9);
        Books book2 = new Books(102, "pride and prejudice", 5);
        Books book3 = new Books(103, "the monk", 3);
        Books book4 = new Books(104, "the courage", 2);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);

        for (Books bk : library) {
            bk.displayInfo();
        }
        System.out.println("No of books in library:" + library.size());
        library.add(new Books(120, "pearls", 11));
        library.add(new Books(105, "courage", 8));
        
        Collections.sort(library, new bookTitleComparator());
        for(Books bk : library) {
            bk.displayInfo();
        }
        Collections.sort(library, new bookRatingComparator());
        for(Books bk : library) {
            bk.displayInfo();
        }
        
     
    }
}
