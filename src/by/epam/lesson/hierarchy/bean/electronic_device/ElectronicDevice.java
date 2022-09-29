package by.epam.lesson.hierarchy.bean.electronic_device;

import java.util.Objects;

public abstract class ElectronicDevice {

    private DeviceType deviceType;
    private Double power;

    public ElectronicDevice() {
    }

    public ElectronicDevice(DeviceType deviceType, Double power) {
        this.deviceType = deviceType;
        this.power = power;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectronicDevice)) return false;
        ElectronicDevice that = (ElectronicDevice) o;
        return getDeviceType() == that.getDeviceType() && Objects.equals(getPower(), that.getPower());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeviceType(), getPower());
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "deviceType=" + deviceType +
                ", power=" + power +
                '}';
    }
}
