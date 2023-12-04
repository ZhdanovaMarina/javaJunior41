package lesson12.com.company.vehicles;

import lesson12.com.company.details.Engine;
import lesson12.com.company.professions.Driver;

import java.util.Objects;

public class Car{

    private String carModel;
    private String carClass;
    private int weight; // вес
    private Driver driver;
    private Engine motor;

    public Car() {
    }

    public Car(String carModel, String carClass, int weight, Driver driver, Engine motor) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (weight != car.weight) return false;
        if (!Objects.equals(carModel, car.carModel)) return false;
        if (!Objects.equals(carClass, car.carClass)) return false;
        if (!Objects.equals(driver, car.driver)) return false;
        return Objects.equals(motor, car.motor);
    }

    @Override
    public int hashCode() {
        int result = carModel != null ? carModel.hashCode() : 0;
        result = 31 * result + (carClass != null ? carClass.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Автомобиль {" + "модель: " + carModel + " класс: " + carClass +
                " вес автомобиля: " + weight + "." + "Водитель: " + driver + " мотор: " +
                motor + '}';
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}
