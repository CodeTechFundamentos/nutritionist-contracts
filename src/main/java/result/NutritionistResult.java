package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class NutritionistResult {
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Integer cnpNumber;
    private Date createdAt;

    public NutritionistResult(String id, String username, String password, String firstName, String lastName, String email, Integer cnpNumber, Date createdAt) {
        this.id = id;
        this.username= username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cnpNumber=cnpNumber;
        this.createdAt = createdAt;
    }
}
