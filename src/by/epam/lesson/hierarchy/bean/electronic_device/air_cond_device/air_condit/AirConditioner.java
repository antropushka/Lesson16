package by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.air_condit;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDeviceType;
import by.epam.lesson.hierarchy.view.ConsoleOutPutter;

import java.io.Serializable;
import java.util.Objects;

public class AirConditioner extends AirConditioningDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private WorkingPrincipleAirConditioner principle;
    private FreonType freonType;

    public AirConditioner() {
        super();
    }

    public AirConditioner(DeviceType deviceType,
                          Double power,
                          AirConditioningDeviceType type,
                          Double noiseLevel,
                          Brand brand,
                          Double price,
                          WorkingPrincipleAirConditioner principle,
                          FreonType freonType) {
        super(deviceType, power, type, noiseLevel, brand, price);
        this.principle = principle;
        this.freonType = freonType;
    }

    public WorkingPrincipleAirConditioner getPrinciple() {
        return principle;
    }

    public void setPrinciple(WorkingPrincipleAirConditioner principle) {
        this.principle = principle;
    }

    public FreonType getFreonType() {
        return freonType;
    }

    public void setFreonType(FreonType freonType) {
        this.freonType = freonType;
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
        if (!(o instanceof AirConditioner)) return false;
        if (!super.equals(o)) return false;
        AirConditioner that = (AirConditioner) o;
        return getPrinciple() == that.getPrinciple()
                && getFreonType() == that.getFreonType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrinciple(), getFreonType());
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "principle=" + principle +
                ", freonType=" + freonType +
                '}';
    }
}
