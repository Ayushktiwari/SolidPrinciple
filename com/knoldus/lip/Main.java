package com.knoldus.lip;

public class Main {

    public void calculateArea(Rectangle r) {
        r.setBreadth(2);
        r.setLength(3);

        System.out.println("Area is : " +r.getArea());
       System.out.println("Length is : "+ r.getLength());
        System.out.println("Breadth is : "+ r.getBreadth());
    }

    public static void main(String[] args) {
        Main lsp = new Main();

        lsp.calculateArea(new Rectangle());
        System.out.println();
        lsp.calculateArea(new Square());
    }
}
