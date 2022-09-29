package by.epam.lesson.hierarchy.view;

import by.epam.lesson.hierarchy.bean.electronic_device.ElectronicDevice;

public class ConsoleOutPutter {

    public static final ConsoleOutPutter instance = new ConsoleOutPutter();

    public ConsoleOutPutter() {
    }

    public static ConsoleOutPutter getInstance() {
        return instance;
    }

    public void printInfoAbout(ElectronicDevice electronicDevice) {
        System.out.println(electronicDevice);
    }
}
