package by.epam.lesson.hierarchy.bean.electronic_device.home_device.window_washer;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDeviceType;

import java.io.Serializable;
import java.util.Objects;

public class WindowWasher extends HomeDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private OrientationSystem orientationSystem;
    private double operatingTime;

    public WindowWasher() {
        super();
    }

    public WindowWasher(DeviceType deviceType,
                        Double power,
                        HomeDeviceType homeDeviceType,
                        Brand brand, Double price,
                        OrientationSystem orientationSystem,
                        double operatingTime) {
        super(deviceType, power, homeDeviceType, brand, price);
        this.orientationSystem = orientationSystem;
        this.operatingTime = operatingTime;
    }

    public OrientationSystem getOrientationSystem() {
        return orientationSystem;
    }

    public void setOrientationSystem(OrientationSystem orientationSystem) {
        this.orientationSystem = orientationSystem;
    }

    public double getOperatingTime() {
        return operatingTime;
    }

    public void setOperatingTime(double operatingTime) {
        this.operatingTime = operatingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WindowWasher)) return false;
        if (!super.equals(o)) return false;
        WindowWasher that = (WindowWasher) o;
        return Double.compare(that.getOperatingTime(), getOperatingTime()) == 0
                && getOrientationSystem() == that.getOrientationSystem();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOrientationSystem(), getOperatingTime());
    }

    @Override
    public String toString() {
        return "WindowWasher{" +
                "orientationSystem=" + orientationSystem +
                ", operatingTime=" + operatingTime +
                '}';
    }
}
