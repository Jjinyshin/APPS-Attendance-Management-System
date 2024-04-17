package apps.ams_spring.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class UserCreateRequest {
    private String name;
    private int schoolNumber;
    private String clubRole;
    private String teamRole;
    private String teamName;
    private double clubYear;
    private LocalDateTime birthDay;
}
