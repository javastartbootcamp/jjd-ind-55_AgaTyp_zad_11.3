package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.ProcessorOverheat;
import pl.javastart.task.computer.additionalexceptions.ZeroValueException;

public class Processor extends OverclockableComponent implements Overclockable {

    static final int DELTA_TEMP = 10;

    public Processor(String name, String manufacturer, String serialNo, int clock) throws ZeroValueException {
        super(name, manufacturer, serialNo, clock);
    }

    @Override
    public void overclock() throws ProcessorOverheat {

        if (temperature + DELTA_TEMP > MAX_TEMPERATURE) {
            throw new ProcessorOverheat("Nie można podkręcić procesora. Procesor zostanie przegrzany");
        } else {
            clock += DELTA_CLOCK;
            temperature += DELTA_TEMP;
        }

    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNo='" + serialNo + '\'' +
                "clock=" + clock +
                ", Temperature=" + temperature +
                '}';
    }

    void overclockProcessor() throws ProcessorOverheat {
        overclock();
        System.out.printf("Procesor został podkręcony o %d MHz\n", DELTA_CLOCK);
    }

}
