package by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.steamer;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDeviceType;
import by.epam.lesson.hierarchy.view.ConsoleOutPutter;

import java.io.Serializable;
import java.util.Objects;

public class Steamer extends ClothesCareDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    private double steamRate;
    private SteamerConstruction construction;

    public Steamer(){

    }

    public Steamer(DeviceType deviceType,
                   Double power,
                   ClothesCareDeviceType type,
                   Brand brand,
                   Double price,
                   double steamRate,
                   SteamerConstruction construction) {
        super(deviceType, power, type, brand, price);
        this.steamRate = steamRate;
        this.construction = construction;
    }

    public double getSteamRate() {
        return steamRate;
    }

    public void setSteamRate(double steamRate) {
        this.steamRate = steamRate;
    }

    public SteamerConstruction getConstruction() {
        return construction;
    }

    public void setConstruction(SteamerConstruction construction) {
        this.construction = construction;
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
        if (!(o instanceof Steamer)) return false;
        if (!super.equals(o)) return false;
        Steamer steamer = (Steamer) o;
        return Double.compare(steamer.getSteamRate(), getSteamRate()) == 0
                && getConstruction() == steamer.getConstruction();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSteamRate(), getConstruction());
    }

    @Override
    public String toString() {
        return "Steamer{" +
                "steamRate=" + steamRate +
                ", construction=" + construction +
                '}';
    }
}
