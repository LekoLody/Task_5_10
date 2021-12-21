package com.company;

public class CargoInfo {
    private final int dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean canBeTurned;
    private final int registryNumber;
    private final boolean isFragile;


    public CargoInfo(
            int dimensions,
            int weight,
            String deliveryAddress,
            boolean canBeTurned,
            int registryNumber,
            boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeTurned = canBeTurned;
        this.registryNumber = registryNumber;
        this.isFragile = isFragile;
    }
    
    public CargoInfo setWeight(int weight){
        return new CargoInfo(dimensions, weight, deliveryAddress, canBeTurned, registryNumber, isFragile);
    }

    public CargoInfo setDeliveryAddress(String deliveryAddress){
        return new CargoInfo(dimensions, weight, deliveryAddress, canBeTurned, registryNumber, isFragile);
    }

    public CargoInfo setCanBeTurned(boolean canBeTurned){
        return new CargoInfo(dimensions, weight, deliveryAddress, canBeTurned, registryNumber, isFragile);
    }

    public CargoInfo setRegistryNumber(int registryNumber){
        return new CargoInfo(dimensions, weight, deliveryAddress, canBeTurned, registryNumber, isFragile);
    }

    public CargoInfo setIsFragile(boolean isFragile){
        return new CargoInfo(dimensions, weight, deliveryAddress, canBeTurned, registryNumber, isFragile);
    }

    public int getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isCanBeTurned() {
        if (canBeTurned) {
            System.out.println("Can be turned");
        }
        else System.out.println("Can't be turned");
        return canBeTurned;
    }
    public int getRegistryNumber() {
        return registryNumber;
    }

    public boolean isFragile() {
        if (isFragile) {
            System.out.println("Is fragile");
        }
        else System.out.println("Isn't fragile");
        return isFragile;
    }

    public void print() {
        System.out.println("Weight is: " + weight + " grams \n"
                +"Address: " + deliveryAddress + "\n"
                + canBeTurned + "\n"
                + "Registry number: " + registryNumber + "\n"
                + isFragile + "\n");
    }


}
