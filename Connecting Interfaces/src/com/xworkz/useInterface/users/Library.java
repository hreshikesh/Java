package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.BookManagement;

public class Library {
    private BookManagement obj;

    public Library(BookManagement obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.lendBook();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}