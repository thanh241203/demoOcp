package com.example.demo.chap3.gener;

public class Crate <T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
        System.out.println(this.contents);
    }

}
