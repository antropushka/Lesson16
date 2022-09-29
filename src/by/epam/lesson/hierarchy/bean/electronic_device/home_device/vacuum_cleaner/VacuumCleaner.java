package by.epam.lesson.hierarchy.bean.electronic_device.home_device.vacuum_cleaner;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDeviceType;

import java.io.Serializable;
import java.util.Objects;

public class VacuumCleaner extends HomeDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private VacuumCleanerConstruction construction;
    private double dustContainerVolume;

    public VacuumCleaner() {

    }

    public VacuumCleaner(DeviceType deviceType,
                         Double power,
                         HomeDeviceType homeDeviceType,
                         Brand brand,
                         Double price,
                         VacuumCleanerConstruction construction,
                         double dustContainerVolume) {
        super(deviceType, power, homeDeviceType, brand, price);
        this.construction = construction;
        this.dustContainerVolume = dustContainerVolume;
    }

    public VacuumCleanerConstruction getConstruction() {
        return construction;
    }

    public void setConstruction(VacuumCleanerConstruction construction) {
        this.construction = construction;
    }

    public double getDustContainerVolume() {
        return dustContainerVolume;
    }

    public void setDustContainerVolume(double dustContainerVolume) {
        this.dustContainerVolume = dustContainerVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.getDustContainerVolume(), getDustContainerVolume()) == 0
                && getConstruction() == that.getConstruction();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getConstruction(), getDustContainerVolume());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "construction=" + construction +
                ", dustContainerVolume=" + dustContainerVolume +
                '}';
    }
}
