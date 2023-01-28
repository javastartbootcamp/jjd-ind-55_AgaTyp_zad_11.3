package pl.javastart.task;

import pl.javastart.task.computer.*;
import pl.javastart.task.computer.additionalexceptions.ZeroValueException;

public class Main {

    public static void main(String[] args) throws ZeroValueException {

        Computer computer = new Computer();

        computer.addComponent(new HardDrive("Dysk twardy", "Seagate", "ASJ7665U", 256));
        computer.addComponent(new HardDrive("Dysk twardy", "WD", "ASJ7665U", 256));
        computer.addComponent(new Processor("Procesor", "Intel", "ASJ7665UD", 3600));
//        computer.addComponent(new Processor("Procesor", "AMD", "ASJ7665UA", 2600));
        computer.addComponent(new Memory("Pamięć RAM", "Kingston", "987JHY654", 3200, 16));

//        computer.overclockComponent();
        computer.printInfo();
        computer.overclockProcessor();
        computer.overclockProcessor();
        computer.overclockProcessor();
        computer.overclockProcessor();
        computer.overclockProcessor();
//        computer.overclockProcessor();
        computer.overclockMemory();
        computer.overclockMemory();
        computer.overclockMemory();
        computer.overclockMemory();
//        computer.overclockMemory();
        computer.printInfo();

    }
}
