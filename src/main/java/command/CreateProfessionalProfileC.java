package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;
import java.util.List;

@Value
public class CreateProfessionalProfileC {
    @TargetAggregateIdentifier
    private String id;

    private String professional_experience_description;
    private Integer nutritionistId;

}