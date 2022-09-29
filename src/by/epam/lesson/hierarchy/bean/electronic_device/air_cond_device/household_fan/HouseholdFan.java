package by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.household_fan;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDeviceType;
import by.epam.lesson.hierarchy.view.ConsoleOutPutter;

import java.io.Serializable;
import java.util.Objects;

public class HouseholdFan extends AirConditioningDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private HouseholdFanConstructionType constructionType;
    private int numberOfSpeeds;

    public HouseholdFan() {
        super();
    }

    public HouseholdFan(DeviceType deviceType,
                        Double power,
                        AirConditioningDeviceType type,
                        Double noiseLevel,
                        Brand brand,
                        Double price,
                        HouseholdFanConstructionType constructionType,
                        int numberOfSpeeds) {
        super(deviceType, power, type, noiseLevel, brand, price);
        this.constructionType = constructionType;
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public HouseholdFanConstructionType getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(HouseholdFanConstructionType constructionType) {
        this.constructionType = constructionType;
    }

    public int getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    public void setNumberOfSpeeds(int numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

    @Override
    public void turnOn() {
        ConsoleOutPutter.printHelloMessage();
    }

    @Override
    public void turnOff() {
        ConsoleOutPutter.printGoodByeMessage();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HouseholdFan)) return false;
        if (!super.equals(o)) return false;
        HouseholdFan that = (HouseholdFan) o;
        return getNumberOfSpeeds() == that.getNumberOfSpeeds()
                && getConstructionType() == that.getConstructionType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getConstructionType(), getNumberOfSpeeds());
    }

    @Override
    public String toString() {
        return "HouseholdFan{" +
                "constructionType=" + constructionType +
                ", numberOfSpeeds=" + numberOfSpeeds +
                '}';
    }
}
