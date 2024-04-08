/**
 * program
 */
public class Laptop {
    private String name;
    private int ram;
    private int hardDrive;
    private String operatingSystem;
    private String color;

    public Laptop(String name, int ram, int hardDrive, String operatingSystem, String color) {
        this.name = name;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int gethHardDrive() {
        return hardDrive;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    public String getColor() {
        return color;
    }


    public static void setName(String name) {
        this.name = name;
    }

    public static void setRam(int ram) {
        this.ram = ram;
    }

    public static void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }


    public static void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public static void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Название: " + name + ".  ОЗУ: " + ram + ".  Объем ЖД: " + hardDrive + ".  Операционная система: " + operatingSystem + ".  Цвет: " + color +".";
    }




}