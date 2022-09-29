package by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.iron;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDeviceType;

import java.io.Serializable;
import java.util.Objects;

public class Iron extends ClothesCareDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private String soleplateMaterial;
    private double waterTankVolume;

    public Iron() {
        super();
    }

    public Iron(DeviceType deviceType,
                Double power,
                ClothesCareDeviceType type,
                Brand brand, Double price,
                String soleplateMaterial,
                double waterTankVolume) {
        super(deviceType, power, type, brand, price);
        this.soleplateMaterial = soleplateMaterial;
        this.waterTankVolume = waterTankVolume;
    }

    public String getSoleplateMaterial() {
        return soleplateMaterial;
    }

    public void setSoleplateMaterial(String soleplateMaterial) {
        this.soleplateMaterial = soleplateMaterial;
    }

    public double getWaterTankVolume() {
        return waterTankVolume;
    }

    public void setWaterTankVolume(double waterTankVolume) {
        this.waterTankVolume = waterTankVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Iron)) return false;
        if (!super.equals(o)) return false;
        Iron iron = (Iron) o;
        return Double.compare(iron.getWaterTankVolume(), getWaterTankVolume()) == 0
                && Objects.equals(getSoleplateMaterial(), iron.getSoleplateMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSoleplateMaterial(), getWaterTankVolume());
    }

    @Override
    public String toString() {
        return "Iron{" +
                "soleplateMaterial='" + soleplateMaterial + '\'' +
                ", waterTankVolume=" + waterTankVolume +
                '}';
    }
}
