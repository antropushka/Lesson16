package by.epam.lesson.hierarchy.bean.electronic_device.home_device.steam_cleaner;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDeviceType;
import by.epam.lesson.hierarchy.view.ConsoleOutPutter;

import java.io.Serializable;
import java.util.Objects;

public class SteamCleaner extends HomeDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private double waterHeatingTime;
    private double maxSteamPressure;

    public SteamCleaner() {

    }

    public SteamCleaner(DeviceType deviceType,
                        Double power,
                        HomeDeviceType homeDeviceType,
                        Brand brand,
                        Double price,
                        double waterHeatingTime,
                        double maxSteamPressure) {
        super(deviceType, power, homeDeviceType, brand, price);
        this.waterHeatingTime = waterHeatingTime;
        this.maxSteamPressure = maxSteamPressure;
    }

    public double getWaterHeatingTime() {
        return waterHeatingTime;
    }

    public void setWaterHeatingTime(double waterHeatingTime) {
        this.waterHeatingTime = waterHeatingTime;
    }

    public double getMaxSteamPressure() {
        return maxSteamPressure;
    }

    public void setMaxSteamPressure(double maxSteamPressure) {
        this.maxSteamPressure = maxSteamPressure;
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
        if (!(o instanceof SteamCleaner)) return false;
        if (!super.equals(o)) return false;
        SteamCleaner that = (SteamCleaner) o;
        return Double.compare(that.getWaterHeatingTime(), getWaterHeatingTime()) == 0 && Double.compare(that.getMaxSteamPressure(), getMaxSteamPressure()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWaterHeatingTime(), getMaxSteamPressure());
    }

    @Override
    public String toString() {
        return "SteamCleaner{" +
                "waterHeatingTime=" + waterHeatingTime +
                ", maxSteamPressure=" + maxSteamPressure +
                '}';
    }
}
