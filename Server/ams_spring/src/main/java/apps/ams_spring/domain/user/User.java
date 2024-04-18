package apps.ams_spring.domain.user;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer schoolNumber;
    private String clubRole;
    private String teamRole;

    @Column(length = 100)
    private String teamName;

    private Double clubYear;
    private LocalDate birthDay;

    protected User(){}

    public User(Long id, String name, Integer schoolNumber, String clubRole, String teamRole, String teamName, Double clubYear, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.schoolNumber = schoolNumber;
        this.clubRole = clubRole;
        this.teamRole = teamRole;
        this.teamName = teamName;
        this.clubYear = clubYear;
        this.birthDay = birthDay;
    }
}
