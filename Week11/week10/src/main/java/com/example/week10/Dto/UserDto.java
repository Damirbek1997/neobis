package com.example.week10.Dto;

import com.example.week10.Dto.Transfer.User.AdminDetails;
import com.example.week10.Dto.Transfer.User.Details;
import com.example.week10.Dto.Transfer.User.NewUser;
import com.example.week10.Dto.Transfer.User.UpdateDetails;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "users")
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Null(groups = {UpdateDetails.class})
    @NotNull(groups = {NewUser.class})
    @JsonView({Details.class, AdminDetails.class})
    private Integer id;

    @Column(name = "username", length = 100)
    @Null(groups = {UpdateDetails.class})
    @NotNull(groups = {NewUser.class})
    @JsonView({Details.class, AdminDetails.class})
    private String username;

    @Column(name = "password", length = 100, insertable = false, updatable = false)
    @Null(groups = {UpdateDetails.class})
    @NotNull(groups = {NewUser.class})
    @JsonView({AdminDetails.class})
    private String password;

    @Column(name = "role", length = 100)
    @Null(groups = {UpdateDetails.class})
    @NotNull(groups = {NewUser.class})
    @JsonView({Details.class, AdminDetails.class})
    private String role;

    public UserDto(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
