package com.designPattern.behavioral.strategy;

public class TarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using TAR format.");
    }
}