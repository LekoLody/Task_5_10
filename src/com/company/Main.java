package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3, 3, 3);

        CargoInfo cargoInfo = new CargoInfo(dimensions.getTotalVolume(),
                44,
                "Samara",
                true,
                555555,
                true);

        System.out.println(cargoInfo.getDimensions());
        final Dimensions dimensions1 = dimensions.setLength(11);
        final CargoInfo cargoInfo1 = new CargoInfo(dimensions1.getTotalVolume(),
                cargoInfo.getWeight(),
                cargoInfo.getDeliveryAddress(),
                cargoInfo.isCanBeTurned(),
                cargoInfo.getRegistryNumber(),
                cargoInfo.isFragile());
        cargoInfo.print();
        cargoInfo1.print();
        System.out.println(cargoInfo1.getDimensions());
    }
}
