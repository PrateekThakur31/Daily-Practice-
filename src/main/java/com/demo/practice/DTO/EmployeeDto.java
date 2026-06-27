package com.demo.practice.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

public class EmployeeDto {
    private Long id;
    @NotNull
    @Size(min=3,message = "Atleast 3 Charecters")
    private String name;
    @Email
    private String email;
    @Size( min=10,max=10, message = "Should be Ten Digits")
    private String mobile;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
