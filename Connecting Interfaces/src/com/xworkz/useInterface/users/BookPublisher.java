package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.PublishingGuideline;

public class BookPublisher {
    private PublishingGuideline obj;

    public BookPublisher(PublishingGuideline obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.publishBook();
        } else {
            System.err.println("PublishingGuideline is null");
        }

    }
}