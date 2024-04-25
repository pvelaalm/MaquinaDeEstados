package DecoratorP;

import ExceptionHandler.Machine;

public class DecoratorP implements Machine {
    private Machine machine;

    public DecoratorP(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void handleException(Exception e) {
        System.out.println("Antes de P");
        machine.handleException(e);
        System.out.println("Después de P");
    }
}