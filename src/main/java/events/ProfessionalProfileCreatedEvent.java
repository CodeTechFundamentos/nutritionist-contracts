package events;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class ProfessionalProfileCreatedEvent {
    private String id;
    private String professional_experience_description;
    private String nutritionistId;
}
