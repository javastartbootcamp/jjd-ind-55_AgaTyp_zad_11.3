package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.MemoryOverheat;
import pl.javastart.task.computer.additionalexceptions.ProcessorOverheat;

import java.util.Objects;

public abstract class Component {
    String name;
    String manufacturer;
    String serialNo;

    public Component(String name, String manufacturer, String serialNo) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNo = serialNo;
    }

    abstract void overclockProcessor() throws ProcessorOverheat;

    abstract void overclockMemory() throws MemoryOverheat;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Component component)) {
            return false;
        }
        return name.equals(component.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNo='" + serialNo + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNo() {
        return serialNo;
    }

}
