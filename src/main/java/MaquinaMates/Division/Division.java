package MaquinaMates.Division;

import MaquinaMates.Excepciones.OperacionMatematicaException;
import MaquinaMates.Operation;

public class Division implements Operation {
    public double calculate(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new OperacionMatematicaException("División por cero");
        }
        return operand1 / operand2;
    }
}

