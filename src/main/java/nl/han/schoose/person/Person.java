package nl.han.schoose.person;

import jakarta.persistence.*;

import java.util.Objects;


@Entity(name = "Person")
@Table(
        name = "person"
)
public class Person {
    @Id
    @SequenceGenerator(
            name = "person_id",
            sequenceName = "person_id",
            allocationSize = 1
            )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            // Bepaald naam van sequence in PostgreSQL index
            generator = "person_id"
    )

    private Long id;
    private String first_name;
    private String middle_name;
    private String last_name;

    public Person(Long id, String first_name, String middle_name, String last_name){
        this.id = id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
    }

    // Empty constructor
    public Person() {

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
