package by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.ElectronicDevice;

import java.util.Objects;

public abstract class ClothesCareDevice extends ElectronicDevice {

    private ClothesCareDeviceType type;
    private Brand brand;
    private Double price;

    public ClothesCareDevice() {
    }

    public ClothesCareDevice(DeviceType deviceType,
                             Double power,
                             ClothesCareDeviceType type,
                             Brand brand,
                             Double price) {
        super(deviceType, power);
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public ClothesCareDeviceType getType() {
        return type;
    }

    public void setType(ClothesCareDeviceType type) {
        this.type = type;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClothesCareDevice)) return false;
        if (!super.equals(o)) return false;
        ClothesCareDevice that = (ClothesCareDevice) o;
        return getType() == that.getType() && getBrand() == that.getBrand() && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getBrand(), getPrice());
    }

    @Override
    public String toString() {
        return "ClothesCareDevice{" +
                "type=" + type +
                ", brand=" + brand +
                ", price=" + price +
                '}';
    }
}
