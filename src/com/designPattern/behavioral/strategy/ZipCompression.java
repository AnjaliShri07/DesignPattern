package com.designPattern.behavioral.strategy;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using ZIP format.");
    }
}
