package by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.humidifier;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDeviceType;

import java.io.Serializable;
import java.util.Objects;

public class Humidifier extends AirConditioningDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private Double maxAreaServed;
    private Double waterTankCapacity;

    public Humidifier() {
       super();
    }

    public Humidifier(DeviceType deviceType,
                      Double power,
                      AirConditioningDeviceType type,
                      Double noiseLevel, Brand brand,
                      Double price,
                      Double maxAreaServed,
                      Double waterTankCapacity) {
        super(deviceType, power, type, noiseLevel, brand, price);
        this.maxAreaServed = maxAreaServed;
        this.waterTankCapacity = waterTankCapacity;
    }

    public Double getMaxAreaServed() {
        return maxAreaServed;
    }

    public void setMaxAreaServed(Double maxAreaServed) {
        this.maxAreaServed = maxAreaServed;
    }

    public Double getWaterTankCapacity() {
        return waterTankCapacity;
    }

    public void setWaterTankCapacity(Double waterTankCapacity) {
        this.waterTankCapacity = waterTankCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Humidifier)) return false;
        if (!super.equals(o)) return false;
        Humidifier that = (Humidifier) o;
        return Objects.equals(getMaxAreaServed(), that.getMaxAreaServed())
                && Objects.equals(getWaterTankCapacity(), that.getWaterTankCapacity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaxAreaServed(), getWaterTankCapacity());
    }

    @Override
    public String toString() {
        return "Humidifier{" +
                "maxAreaServed=" + maxAreaServed +
                ", waterTankCapacity=" + waterTankCapacity +
                '}';
    }
}
