package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class NutritionistUpdatedResult {
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public NutritionistUpdatedResult(String id, String username, String password, String firstName, String lastName, String email) {
        this.id = id;
        this.username= username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
