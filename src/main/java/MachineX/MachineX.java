package MachineX;

import ExceptionHandler.Machine;

public class MachineX {
    private Machine machine;

    public MachineX(Machine machine) {
        this.machine = machine;
    }

    public void demonstrate() {
        try {
            throw new RuntimeException("Demo Exception");
        } catch (Exception e) {
            System.out.println("Demostración de que ExceptionHandler no existe:");
            machine.handleException(e);
        }
    }
}
