class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + this.monitorSize);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + this.cpu);
        System.out.println("Memory: " + this.memory);
        System.out.println("HDD: " + this.hd);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer() {
        this.computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");
        this.monitor = new Monitor("32인치", "검은색", "45W");
    }

    public void turnOn() {
        this.computer.turnOn();
        this.monitor.turnOn();
    }

    public void printInfo() {
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer myPC = new PersonalComputer();
        myPC.turnOn();
        myPC.printInfo();
    }
}