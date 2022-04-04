package com.endava.project.watchshop.model;

import javax.validation.constraints.Size;

public class Admin extends User{

    public Admin(int id, String userName, @Size(min = 5, max = 30) String password,
                 @Size(min = 5, max = 30) String email) {
        super(id, userName, password, email);
    }
}
