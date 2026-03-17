package se.lexicon;

import java.time.LocalDate;

public class Car {
    //Step1: fields
    /*String brand;
    String model;
    int year;
    int mileage;*/

    //Step2: Encapsulation
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private Person owner;

    public Car(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        this.mileage = 0;
    }

    public Car(String brand, String model) {
        this(brand, model, LocalDate.now().getYear());
    }

    //Default constructor
  /*  public Car() {

        this.brand = null;
        this.model = null;
        this.year = 0;
        this.mileage = 0;
    }*/

    //Step2: Setter and Getter


    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= LocalDate.now().getYear() + 1) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year is not valid");
        }
    }

    public int getMileage() {
        return mileage;
    }

    // Add getter and setter for the owner


    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    //Step 1: Methods
    public void drive(int miles) {
        if (miles > 0) {
            mileage += miles;
        } else {
            throw new IllegalArgumentException("Miles cannot be negative");
        }

    }

    public String getCarInfo() {
        String ownerInfo;
        if (owner != null) {
            ownerInfo= owner.getPersonInfo();
        } else {
            ownerInfo = "No owner";
        }
        return "Brand: " + brand + ", Model:  " + model + ", Year" + year + ", Mileage: " + mileage + ", Owner: " + ownerInfo;
    }
}
