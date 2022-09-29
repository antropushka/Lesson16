package by.epam.lesson.hierarchy.main;

import by.epam.lesson.hierarchy.bean.electronic_device.Brand;
import by.epam.lesson.hierarchy.bean.electronic_device.DeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.ElectronicDevice;
import by.epam.lesson.hierarchy.bean.electronic_device.air_conditioning_device.air_cond_device.AirConditioningDeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.air_conditioning_device.air_cond_device.household_fan.HouseholdFan;
import by.epam.lesson.hierarchy.bean.electronic_device.air_conditioning_device.air_cond_device.household_fan.HouseholdFanConstructionType;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.HomeDeviceType;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.vacuum_cleaner.VacuumCleaner;
import by.epam.lesson.hierarchy.bean.electronic_device.home_device.vacuum_cleaner.VacuumCleanerConstruction;
import by.epam.lesson.hierarchy.view.ConsoleOutPutter;

public class Main {

    public static void main(String[] args) {
        HouseholdFan householdFan = new HouseholdFan(DeviceType.AIR_CONDITIONING_DEVICE,
                                                    7.0,
                                                    AirConditioningDeviceType.AIR_CONDITIONER,
                3.0, Brand.XIAOMI, 190.0, HouseholdFanConstructionType.AXIAL, 3);

        System.out.println(householdFan);

        VacuumCleaner vacuumCleaner = new VacuumCleaner(DeviceType.HOME_DEVICE, 5.0, HomeDeviceType.A_VACUUM_CLEANER,
                Brand.DYSON, 3000.0, VacuumCleanerConstruction.UPRIGHT, 10.0);

        System.out.println(vacuumCleaner);

    }
}
