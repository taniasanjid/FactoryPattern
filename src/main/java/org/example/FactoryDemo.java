package org.example;

public class FactoryDemo {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.createDocument("word");
        doc1.open();  // Output: Opening a Word document.

        Document doc2 = factory.createDocument("pdf");
        doc2.open();  // Output: Opening a PDF document.

    }
}
