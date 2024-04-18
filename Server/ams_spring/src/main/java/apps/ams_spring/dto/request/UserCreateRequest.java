package apps.ams_spring.dto.request;

import apps.ams_spring.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserCreateRequest {
    private String name;
    private Integer schoolNumber;
    private String clubRole;
    private String teamRole;
    private String teamName;
    private Double clubYear;
    private LocalDate birthDay;

    public User toEntity() {
        return new User(null, name, schoolNumber, clubRole, teamRole, teamName, clubYear, birthDay);
    }
}
