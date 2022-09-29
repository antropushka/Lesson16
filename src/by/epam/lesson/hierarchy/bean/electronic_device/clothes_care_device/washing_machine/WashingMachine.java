package by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.washing_machine;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDeviceType;
import by.epam.lesson.hierarchy.view.ConsoleOutPutter;

import java.io.Serializable;
import java.util.Objects;

public class WashingMachine extends ClothesCareDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private double maximumLoad;
    private double maximumSpinSpeed;
    private int numOfPrograms;

    public WashingMachine(){
        super();
    }

    public WashingMachine(DeviceType deviceType,
                          Double power,
                          ClothesCareDeviceType type,
                          Brand brand, Double price,
                          double maximumLoad,
                          double maximumSpinSpeed,
                          int numOfPrograms) {
        super(deviceType, power, type, brand, price);
        this.maximumLoad = maximumLoad;
        this.maximumSpinSpeed = maximumSpinSpeed;
        this.numOfPrograms = numOfPrograms;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public double getMaximumSpinSpeed() {
        return maximumSpinSpeed;
    }

    public void setMaximumSpinSpeed(double maximumSpinSpeed) {
        this.maximumSpinSpeed = maximumSpinSpeed;
    }

    public int getNumOfPrograms() {
        return numOfPrograms;
    }

    public void setNumOfPrograms(int numOfPrograms) {
        this.numOfPrograms = numOfPrograms;
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
        if (!(o instanceof WashingMachine)) return false;
        if (!super.equals(o)) return false;
        WashingMachine that = (WashingMachine) o;
        return Double.compare(that.getMaximumLoad(), getMaximumLoad()) == 0
                && Double.compare(that.getMaximumSpinSpeed(), getMaximumSpinSpeed()) == 0
                && getNumOfPrograms() == that.getNumOfPrograms();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaximumLoad(), getMaximumSpinSpeed(), getNumOfPrograms());
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "maximumLoad=" + maximumLoad +
                ", maximumSpinSpeed=" + maximumSpinSpeed +
                ", numOfPrograms=" + numOfPrograms +
                '}';
    }
}
