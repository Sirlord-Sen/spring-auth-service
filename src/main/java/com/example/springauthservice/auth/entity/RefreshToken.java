package com.example.springauthservice.auth.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "refreshtokens")
public class RefreshToken {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(columnDefinition = "boolean default false")
    private Boolean isRevoked;

    @Column()
    private String jti;

    @Column()
    private String userId;

    @CreationTimestamp
    @Column()
    private Date created_at;

    @UpdateTimestamp
    @Column()
    private Date updated_at;

    public UUID getId(){
        return id;
    }

    public void setIsRevoked(Boolean isRevoked){
        this.isRevoked = isRevoked;
    }

    public Boolean getIsRevoked(){
        return isRevoked;
    }

    public void setJti(String jti){
        this.jti = jti;
    }

    public String getJti(){
        return jti;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }

    public Date getCreated_at(){
        return created_at;
    }

    public Date getUpdated_at(){
        return updated_at;
    }
}
