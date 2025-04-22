package com.xworkz.useInterface.impl;;

import com.xworkz.useInterface.interfaces.PublishingGuideline;

public class PenguinPublisherImpl implements PublishingGuideline {
    public void publishBook() {
        System.out.println("PenguinPublisherImpl is executing publishBook.");
    }
}