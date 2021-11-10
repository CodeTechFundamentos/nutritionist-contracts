package events;

import lombok.Value;

@Value
public class ProfessionalProfileUpdatedEvent {
    private String id;
    private String professional_experience_description;
}
