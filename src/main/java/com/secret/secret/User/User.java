package com.secret.secret.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name = "login")
    private String  login;
    @Column(name = "password")
    private String  password;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_anonymous")
    private Boolean isAnonymous;
    @Column(name = "user_name")
    private String  userName;
    @Column(name = "user_second_name")
    private String  userSecondName;
    @Column(name = "user_surname")
    private String  userSurname;

    public User() {
    }

    public User(Integer id, String login, String password, Boolean isActive, Boolean isAnonymous, String userName, String userSecondName, String userSurname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.isActive = isActive;
        this.isAnonymous = isAnonymous;
        this.userName = userName;
        this.userSecondName = userSecondName;
        this.userSurname = userSurname;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isIsActive() {
        return this.isActive;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean isIsAnonymous() {
        return this.isAnonymous;
    }

    public Boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSecondName() {
        return this.userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public String getUserSurname() {
        return this.userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

}
