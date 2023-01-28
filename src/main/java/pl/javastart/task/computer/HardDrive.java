package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.ZeroValueException;

public class HardDrive extends Component {
    int capacity;

    public HardDrive(String name, String manufacturer, String serialNo, int capacity) throws ZeroValueException {
        super(name, manufacturer, serialNo);
        if (capacity == 0) {
            throw new ZeroValueException("Pojemność nie może być równa 0");
        } else {
            this.capacity = capacity;
        }
//        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    void overclockProcessor() {
    }

    @Override
    void overclockMemory() {
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
