package result;

import lombok.Getter;

@Getter
public class ProfessionalProfileUpdatedResult {
    private String id;
    private String professional_experience_description;

    public ProfessionalProfileUpdatedResult(String id, String professional_experience_description) {
        this.id = id;
        this.professional_experience_description = professional_experience_description;
    }
}
