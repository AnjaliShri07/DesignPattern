package com.designPattern.behavioral.strategy;

public class RarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using RAR format.");
    }
}
