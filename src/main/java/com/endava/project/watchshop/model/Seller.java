package com.endava.project.watchshop.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Map;

@Getter
@Setter
@NotNull
public class Seller extends User{

    @Size(min = 3, max = 30)
    private String brandName;

    @Size(min = 5, max = 30)
    private String address;

    @Size(min=10, max = 30)
    private String phoneNumber;

    private Map<Watch, Integer> watchList;

    public Seller(int id, String userName, @Size(min = 5, max = 30) String password,
                  String brandName, @Size(min = 5, max = 30) String email,
                  String address, String phoneNumber, Map<Watch, Integer> watchList) {
        super(id, userName, password, email);
        this.brandName = brandName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.watchList = watchList;
    }
}
