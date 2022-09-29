package by.epam.lesson.hierarchy.view;

import by.epam.lesson.hierarchy.bean.electronic_device.ElectronicDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.air_cond_device.AirConditioningDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.clothes_care_device.ClothesCareDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDevice;

public class ConsoleOutPutter {

    public static final ConsoleOutPutter instance = new ConsoleOutPutter();

    public ConsoleOutPutter() {
    }

    public static ConsoleOutPutter getInstance() {
        return instance;
    }

    public void printInfoAbout(AirConditioningDevice airConditioningDevice) {
        System.out.println(airConditioningDevice);
    }

    public void printInfoAbout(ClothesCareDevice clothesCareDevice) {
        System.out.println(clothesCareDevice);
    }

    public void printInfoAbout(HomeDevice homeDevice) {
        System.out.println(homeDevice);
    }
}
