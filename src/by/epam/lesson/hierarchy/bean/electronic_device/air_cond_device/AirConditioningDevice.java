package by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.ElectronicDevice;

import java.util.Objects;

public abstract class AirConditioningDevice extends ElectronicDevice {

    private AirConditioningDeviceType type;
    private Double noiseLevel;
    private Brand brand;
    private Double price;

    public AirConditioningDevice() {
        super();
    }

    public AirConditioningDevice(DeviceType deviceType,
                                 Double power,
                                 AirConditioningDeviceType type,
                                 Double noiseLevel,
                                 Brand brand,
                                 Double price) {
        super(deviceType, power);
        this.type = type;
        this.noiseLevel = noiseLevel;
        this.brand = brand;
        this.price = price;
    }




    public AirConditioningDeviceType getType() {
        return type;
    }

    public void setType(AirConditioningDeviceType type) {
        this.type = type;
    }

    public Double getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(Double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirConditioningDevice)) return false;
        if (!super.equals(o)) return false;
        AirConditioningDevice that = (AirConditioningDevice) o;
        return getType() == that.getType()
                & Objects.equals(getNoiseLevel(), that.getNoiseLevel())
                && getBrand() == that.getBrand() && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getNoiseLevel(), getBrand(), getPrice());
    }

    @Override
    public String toString() {
        return "AirConditioningDevice{" +
                "type=" + type +
                ", noiseLevel=" + noiseLevel +
                ", brand=" + brand +
                ", price=" + price +
                '}';
    }
}
