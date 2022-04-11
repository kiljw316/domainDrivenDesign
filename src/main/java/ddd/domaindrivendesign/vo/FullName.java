package ddd.domaindrivendesign.vo;

import lombok.Getter;

import java.util.Objects;

@Getter
public class FullName {

    private final String firstName;
    private final String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FullName fullName = (FullName) o;

        if (!Objects.equals(firstName, fullName.firstName)) return false;
        return Objects.equals(lastName, fullName.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
