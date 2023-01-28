package pl.javastart.task.computer;

import pl.javastart.task.computer.additionalexceptions.ComponentExistsException;
import pl.javastart.task.computer.additionalexceptions.FullComputerException;
import pl.javastart.task.computer.additionalexceptions.MemoryOverheat;
import pl.javastart.task.computer.additionalexceptions.ProcessorOverheat;

public class Computer {
    private Component[] components = new Component[3];
    private int componentNo = 0;

    public void addComponent(Component component) {
        try {
            isSpaceInComputer();
            componentUsed(component);
            components[componentNo] = component;
            componentNo++;
        } catch (ComponentExistsException | FullComputerException e) {
            System.err.println(e.getMessage());
        }
    }

    private void isSpaceInComputer() throws FullComputerException {
        if (componentNo >= components.length) {
            throw new FullComputerException("Zostały już dodane 3 podzespoły");
        }
    }
    
    private void componentUsed(Component component) throws ComponentExistsException {
        for (Component comp : components) {
            if (component.equals(comp)) {
                throw new ComponentExistsException("Ten komponent już został dodany: " + component.toString());
            }
        }
    }

    public void overclockProcessor() {
        for (Component comp : components) {
            try {
                comp.overclockProcessor();
            } catch (ProcessorOverheat e) {
//                System.out.println(e.getMessage());
                System.err.println(e.getMessage());
            }

        }
    }

    public void overclockMemory() {
        for (Component comp : components) {
            try {
                comp.overclockMemory();
            } catch (MemoryOverheat e) {
//                System.out.println(e.getMessage());
                System.err.println(e.getMessage());
            }

        }
    }

    public void printInfo() {
        for (Component comp : components) {
            System.out.println(comp.toString());
        }
    }
}
