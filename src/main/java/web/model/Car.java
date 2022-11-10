package web.model;

public class Car {
    private String brand;
    private String model;
    private int ecoClass;

    public Car(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        this.ecoClass = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEcoClass() {
        return ecoClass;
    }

    public void setEcoClass(int ecoClass) {
        this.ecoClass = ecoClass;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ecoClass=" + ecoClass +
                '}';
    }
}
