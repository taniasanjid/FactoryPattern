package org.example;

public class DocumentFactory {
    public Document createDocument(String type) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PDFDocument();}
        else {
                return null;
            }
        }
    }
