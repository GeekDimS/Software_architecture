package lesson3_2;

import java.awt.*;

enum TypeCar {
    SEDAN,
    PICKUP
}

enum TypeFuel {
    GASOLINE,
    DIESEL, ELECTRICITY
}

enum TypeGearBox {MT, AT}

/**
 * @author DimS on 07.01.2023
 */
public class Main {
    public static void main(String[] args) {

    }
}

abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;



    public void movement() {
    }

    public void maintenance() {
    }

    public boolean gearShifting() {
        return true;
    }

    public boolean switchHeadLights() {
        return true;
    }

    public boolean switchWipers() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(TypeGearBox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

class SweepCar extends Car
{
    public void sweeping(){}
}

interface iRefueling{
    void fuel(TypeFuel typeFuel);
}

interface iWipe{
        void wipWindshield();
        void wipHeadlights();
        void wipMirrors();}

class PickUp extends Car implements iRefueling, iWipe
{
    private int loadCapacity;//загрузка авто

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void fuel(TypeFuel typeFuel) {

    }
}

class FutureCar extends Car{
    //FutureCar(){this.setNumberWheels(3);}
    private void fly(){}
}

class gasolineCar extends Car implements iRefueling{
    gasolineCar(){
        this.setFuelType(TypeFuel.GASOLINE);
    }

    @Override
    public void fuel(TypeFuel typeFuel) {
        if(typeFuel == TypeFuel.GASOLINE){
       System.out.println("Заправился бензином");}
        else {
            System.out.println("Это топливо не подходит для бензиновой машины");
        }
    }
}

class dieselCar extends Car implements iRefueling{
    dieselCar(){
        this.setFuelType(TypeFuel.DIESEL);
    }

    @Override
    public void fuel(TypeFuel typeFuel) {
        if(typeFuel == TypeFuel.DIESEL){
            System.out.println("Заправился дизелем");}
        else {
            System.out.println("Это топливо не подходит для дизельной машины");
        }
    }
}