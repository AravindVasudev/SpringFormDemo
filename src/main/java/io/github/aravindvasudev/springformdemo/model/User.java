package io.github.aravindvasudev.springformdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull @Size(min = 1, message = "is required")
    private String name;

    @NotNull @Min(value = 10, message = "Must be > 9") @Max(value = 99, message = "Must be < 100")
    private int age;

    @NotNull @Size(min=3, message = "is required")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("NAME: %s | AGE: %s | EMAIL: %s", name, age, email);
    }
}
