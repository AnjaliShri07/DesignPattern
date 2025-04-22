package com.designPattern.behavioral.strategy;

public class CompressionApp {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();

        context.setCompressionStrategy(new ZipCompression());
        context.compressFile("report.docx");

        context.setCompressionStrategy(new RarCompression());
        context.compressFile("data.csv");

        context.setCompressionStrategy(new TarCompression());
        context.compressFile("project-folder");
    }
}
