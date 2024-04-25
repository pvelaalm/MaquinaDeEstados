package DecoratorN;

import ExceptionHandler.Machine;

public class DecoratorN implements Machine {
    private Machine machine;

    public DecoratorN(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void handleException(Exception e) {
        System.out.println("Antes de N");
        machine.handleException(e);
        System.out.println("Después de N");
    }
}