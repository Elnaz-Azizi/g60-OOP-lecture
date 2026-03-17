package se.lexicon;

import java.time.LocalDate;

public class Person {
    // Fields
    private final String id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public Person(String id, String name, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getPersonInfo() {
        return "Person Info -> ID: " + id + ", Name: " + name + ", Email: " + email + ", BirthDate: " + birthDate;
    }
}
