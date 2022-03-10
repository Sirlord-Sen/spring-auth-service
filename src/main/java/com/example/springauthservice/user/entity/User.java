package com.example.springauthservice.user.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column()
    private String username;

    @Column(unique = true)
    private String email;

    @Column()
    private String firstname;

    @Column()
    private String surname;

    @Column()
    private String password;

    @Column()
    private String confirmTokenPassword;

    @CreationTimestamp
    @Column()
    private Date created_at;

    @UpdateTimestamp
    @Column()
    private Date updated_at;


    public UUID getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setConfirmTokenPassword(String confirmTokenPassword){
        this.confirmTokenPassword = confirmTokenPassword;
    }

    public String getConfirmTokenPassword(){
        return confirmTokenPassword;
    }

    public Date getCreated_at(){
        return created_at;
    }

    public Date getUpdated_at(){
        return updated_at;
    }

}
