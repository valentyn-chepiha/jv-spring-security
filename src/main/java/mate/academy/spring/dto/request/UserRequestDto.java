package mate.academy.spring.dto.request;

import mate.academy.spring.validation.PasswordMatchRePassword;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@PasswordMatchRePassword.List({
    @PasswordMatchRePassword(
        field = "password",
        fieldMatch = "repeatPassword",
        message = "Password not equal to repeat password"
    )
})
public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 6, message = "Password must be longer than 6 characters")
    private String password;
    @Size(min = 6, message = "Repeat password must be longer than 6 characters")
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
