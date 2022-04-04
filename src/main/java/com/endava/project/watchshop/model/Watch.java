package com.endava.project.watchshop.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@Setter
@NotNull
public class Watch {

    private int id;

    @Size(min = 2, max = 30)
    private String name;

    @Size(min = 2, max = 30)
    private String brand;

    private double price;

    private String description;

    private Display display;

    private double caseWidth;

    private int waterResistance;

    private Gender gender;

    private Material strapMaterial;
}
