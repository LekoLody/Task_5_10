package com.company;

public class Dimensions {
    private final int length;
    private final int height;
    private final int width;
    int totalVolume;

    public Dimensions(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(length, height, width);
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(length, height, width);
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(length, height, width);
    }

    public int getTotalVolume() {
        totalVolume = length * height * width;
        return totalVolume;
    }

}
