package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        try (Scanner scannerUsers = new Scanner(new File("users.txt"));
             Scanner scannerShop = new Scanner(new File("books.txt"))) {
            while (scannerUsers.hasNext()) {
                User user = new User(scannerUsers.nextLine());
                users.add(user);
            }
            while (scannerShop.hasNext()) {
                Book book = new Book(scannerShop.nextLine());
                books.add(book);
            }
            //usersClass(users, books);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void workWithUsers (List<User> users, List<Book> books) {}
}
