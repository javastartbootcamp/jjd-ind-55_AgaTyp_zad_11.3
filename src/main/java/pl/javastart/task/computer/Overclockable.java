package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.MemoryOverheat;
import pl.javastart.task.computer.additionalexceptions.ProcessorOverheat;

public interface Overclockable {
    void overclock() throws ProcessorOverheat, MemoryOverheat;
}
