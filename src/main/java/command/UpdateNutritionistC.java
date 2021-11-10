package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class UpdateNutritionistC {
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
