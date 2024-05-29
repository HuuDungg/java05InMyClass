package com.example.lab01.lab03.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @NotEmpty(message = "ID should not be empty")
    private String id;

    @NotEmpty(message = "Code should not be empty")
    private String code;

    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Min(value = 20, message = "Age must be at least 20")
    private int age;

    // @NotEmpty should be removed because it's not valid for boolean
    private boolean gender;

    @NotEmpty(message = "Address should not be empty")
    private String address;

    public boolean isFemale() {
        return gender;
    }

}
