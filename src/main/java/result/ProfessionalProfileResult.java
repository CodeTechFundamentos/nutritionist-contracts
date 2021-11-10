package result;

import lombok.Getter;

@Getter
public class ProfessionalProfileResult {
    private String id;
    private String professional_experience_description;
    private Integer nutritionistId;


    public ProfessionalProfileResult(String id, String professional_experience_description, Integer nutritionistId) {
        this.id = id;
        this.professional_experience_description = professional_experience_description;
        this.nutritionistId = nutritionistId;
    }
}
