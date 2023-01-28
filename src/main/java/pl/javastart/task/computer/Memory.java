package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.MemoryOverheat;
import pl.javastart.task.computer.additionalexceptions.ZeroValueException;

public class Memory extends OverclockableComponent implements Overclockable {
    int ram;
    static final int DELTA_TEMP = 15;

    public Memory(String name, String manufacturer, String serialNo, int clock, int ram) throws ZeroValueException {
        super(name, manufacturer, serialNo, clock);
        if (ram == 0) {
            throw new ZeroValueException("Pojemność RAMu nie może być równa 0");
        } else {
            this.ram = ram;
        }
    }

    @Override
    public void overclock() throws MemoryOverheat {

        if (this.temperature + DELTA_TEMP > MAX_TEMPERATURE) {
            throw new MemoryOverheat("Nie można podkręcić RAMu. Pamięć zostanie przegrzana");
        } else {
            clock += DELTA_CLOCK;
            temperature += DELTA_TEMP;
        }

    }

    void overclockMemory() throws MemoryOverheat {
        overclock();
        System.out.printf("Pamięć została podkręcona o %d MHz\n", DELTA_CLOCK);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", ram=" + ram +
                ", clock=" + clock +
                ", Temperature=" + temperature +
                '}';
    }

    public int getRam() {
        return ram;
    }

}
