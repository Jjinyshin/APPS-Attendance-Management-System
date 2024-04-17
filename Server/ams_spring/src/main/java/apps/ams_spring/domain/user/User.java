package apps.ams_spring.domain.user;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private String name;
    private Integer schoolNumber;
    private String clubRole;
    private String teamRole;

    @Column(length = 100)
    private String teamName;

    private Double clubYear;
    private LocalDate birthDay;

    protected User(){}
    public User(String name, int schoolNumber, String clubRole, String teamRole, String teamName, double clubYear, LocalDate birthDay) {
    }
}
