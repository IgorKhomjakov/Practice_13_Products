package ru.netology.product;

public class Smartphone extends Product {

    private String smartphoneName;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String smartphoneName, String manufacturer) {
        super(id, name, price);
        this.smartphoneName = smartphoneName;
        this.manufacturer = manufacturer;
    }

    @Override
    public void use() {
        System.out.println("Используем смартфон:" + smartphoneName);;
    }

    @Override
    public boolean isTooExpensive() {
        boolean result;
        if (price > 150_000) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String getSmartphoneName() {
        return smartphoneName;
    }

    public void setSmartphoneName(String smartphoneName) {
        this.smartphoneName = smartphoneName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
