package MaquinaMates.CompositeOperation;

import MaquinaMates.Operation;

import java.util.ArrayList;
import java.util.List;

public class CompositeOperation implements Operation {
    private List<Operation> operations = new ArrayList<>();

    public void add(Operation operation) {
        operations.add(operation);
    }

    public void remove(Operation operation) {
        operations.remove(operation);
    }

    @Override
    public double calculate(double a, double b) {
        double result = Double.NaN;
        for (Operation operation : operations) {
            result = operation.calculate(a, b);
        }
        return result;
    }
}
