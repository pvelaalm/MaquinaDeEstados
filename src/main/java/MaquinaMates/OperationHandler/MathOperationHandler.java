package MaquinaMates.OperationHandler;

import MaquinaMates.Operation;

public class MathOperationHandler implements Operation {
    private Operation nextOperation;
    public void setNextOperation(Operation nextOperation){
        this.nextOperation = nextOperation;
    }

    @Override
    public double calculate(double a, double b) {
        if (nextOperation != null){
            return nextOperation.calculate(a, b);
        }else {
            throw new UnsupportedOperationException("Operación no soportada");
        }
    }
}
