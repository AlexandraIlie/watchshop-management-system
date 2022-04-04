package com.endava.project.watchshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@Setter
@NotNull
public class User {

    protected int id;

    private String userName;

    @Size(min=5, max = 30)
    private String password;

    @Size(min=5, max = 30)
    private String email;

}
