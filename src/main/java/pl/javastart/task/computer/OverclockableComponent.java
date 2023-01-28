package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.MemoryOverheat;
import pl.javastart.task.computer.additionalexceptions.ProcessorOverheat;
import pl.javastart.task.computer.additionalexceptions.ZeroValueException;

public abstract class OverclockableComponent extends Component {
    int clock;
    int temperature = 50;
    static final int MAX_TEMPERATURE = 100;
    static final int DELTA_CLOCK = 100;

    public OverclockableComponent(String name, String manufacturer, String serialNo, int clock) throws ZeroValueException {
        super(name, manufacturer, serialNo);
        if (clock == 0) {
            throw new ZeroValueException("Wartość taktowania nie może być równa 0");
        } else {
            this.clock = clock;
        }
    }

    @Override
    void overclockProcessor() throws ProcessorOverheat {
    }

    @Override
    void overclockMemory() throws MemoryOverheat {

    }

}
