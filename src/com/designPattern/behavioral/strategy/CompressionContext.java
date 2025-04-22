package com.designPattern.behavioral.strategy;

public class CompressionContext {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compressFile(String fileName) {
        if (strategy == null) {
            throw new IllegalStateException("Compression strategy is not set");
        }
        strategy.compress(fileName);
    }
}
