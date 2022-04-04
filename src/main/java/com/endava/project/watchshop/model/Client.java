package com.endava.project.watchshop.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class Client extends User{

    @NotNull
    @Size(min=2, max = 30)
    private String firstname;

    @NotNull
    @Size(min=2, max = 30)
    private String lastname;

    @Size(min = 5, max = 30)
    private String address;

    @Size(min=10, max = 30)
    private String phoneNumber;

    private Order order;

    private List<Watch> inCart;

    private List<Watch> favProducts;


        public Client(int id, String userName, @Size(min = 5, max = 30) String password,
                      String firstname, String lastname, @Size(min = 5, max = 30) String email,
                      String address, String phoneNumber) {
        super(id, userName, password, email);
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
