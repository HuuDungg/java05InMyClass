package com.example.lab01.buoi56.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @NotBlank
    @Size(min = 5,max = 10)
    private String name;
    @Min(14)
    @Digits(integer = 5, fraction = 0)
    private int age;
    @NotBlank
    private String address;
    @NotBlank
    private String position;
    @NotEmpty
    private String[] hobbies;
    @NotNull
    private Country country;
}
