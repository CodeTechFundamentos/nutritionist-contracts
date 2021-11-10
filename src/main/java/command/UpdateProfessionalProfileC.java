package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class UpdateProfessionalProfileC {
    @TargetAggregateIdentifier
    private String id;

    private String professional_experience_description;
}