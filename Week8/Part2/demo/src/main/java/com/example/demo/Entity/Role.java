package com.example.demo.Entity;


import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "authority", length = 100)
    private String authority;

    @Transient
    @ManyToMany
    private Set<Users> users;

    public Role(Integer id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return getAuthority();
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
