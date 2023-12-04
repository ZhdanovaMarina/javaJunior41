package lesson12.com.company.vehicles;

import lesson12.com.company.details.Engine;
import lesson12.com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar() {
    }

    public SportCar(String carModel, String carClass, int weight, Driver driver,
                    Engine motor, int maxSpeed) {
        super(carModel, carClass, weight, driver, motor);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
