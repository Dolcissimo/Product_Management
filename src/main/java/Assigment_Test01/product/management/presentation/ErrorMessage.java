package Assigment_Test01.product.management.presentation;

import com.sun.jdi.request.StepRequest;
import org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder;

import java.util.List;

public class ErrorMessage {

    private List<String> errors;

    public ErrorMessage(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
