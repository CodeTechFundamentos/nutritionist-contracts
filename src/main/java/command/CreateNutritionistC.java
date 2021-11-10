package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class CreateNutritionistC {
    @TargetAggregateIdentifier
    private String id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Integer cnpNumber;
    private Date createdAt;
}