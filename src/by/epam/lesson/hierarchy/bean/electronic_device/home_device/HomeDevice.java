package by.epam.lesson.hierarchy.bean.electronic_device.home_device;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.ElectronicDevice;

import java.io.Serializable;
import java.util.Objects;

public class HomeDevice extends ElectronicDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private HomeDeviceType homeDeviceType;
    private Brand brand;
    private Double price;

    public HomeDevice() {
        super();
    }

    public HomeDevice(DeviceType deviceType, Double power, HomeDeviceType homeDeviceType, Brand brand, Double price) {
        super(deviceType, power);
        this.homeDeviceType = homeDeviceType;
        this.brand = brand;
        this.price = price;
    }

    public HomeDeviceType getHomeDeviceType() {
        return homeDeviceType;
    }

    public void setHomeDeviceType(HomeDeviceType homeDeviceType) {
        this.homeDeviceType = homeDeviceType;
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
        if (!(o instanceof HomeDevice)) return false;
        if (!super.equals(o)) return false;
        HomeDevice that = (HomeDevice) o;
        return getHomeDeviceType() == that.getHomeDeviceType() && getBrand() == that.getBrand() && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHomeDeviceType(), getBrand(), getPrice());
    }

    @Override
    public String toString() {
        return "HomeDevice{" +
                "homeDeviceType=" + homeDeviceType +
                ", brand=" + brand +
                ", price=" + price +
                '}';
    }
}
