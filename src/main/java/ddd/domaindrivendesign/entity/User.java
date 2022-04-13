package ddd.domaindrivendesign.entity;

import lombok.Builder;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Builder
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USERNAME", nullable = false)
    @Size(min = 3)
    private String name;

    protected User() {}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
