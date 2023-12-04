package lesson12.com.company.vehicles;

import lesson12.com.company.details.Engine;
import lesson12.com.company.professions.Driver;

public class Lorry extends Car{
    private int liftingCapacity; // грузоподъемность


    public Lorry() {
    }

    public Lorry(String carModel, String carClass, int weight, Driver driver,
                 Engine motor, int liftingCapacity) {
        super(carModel, carClass, weight, driver, motor);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return liftingCapacity == lorry.liftingCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + liftingCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "liftingCapacity=" + liftingCapacity +
                '}';
    }
}
