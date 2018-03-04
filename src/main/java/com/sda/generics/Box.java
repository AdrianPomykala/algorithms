package com.sda.generics;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public Box() {
    }

    public void whatsInTheBox(){
        if(content == null) {
            System.out.println("The box is empty");
        } else {
            System.out.println("The box contains: " + content);
        }
    }
}
