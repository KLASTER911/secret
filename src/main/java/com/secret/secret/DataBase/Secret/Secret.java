package com.secret.secret.DataBase.Secret;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secrets")
public class Secret {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "user")
    private String  user;

    @Column(name = "message")
    private String  message;

    @Column(name = "access_code")
    private Integer accessCode;

    @Column(name = "url_to_access")
    private String  urlToAccess;

    @Column(name = "is_availeble")
    private Boolean isAvaileble;

    @Column(name = "data_create", nullable = true)
    private Integer dateCreate;
    
    @Column(name = "data_to_delete", nullable = true)
    private Integer dateToDelete;

    public Secret() {
    }

    public Secret(Integer id, String user, String message, Integer accessCode, String urlToAccess, Boolean isAvaileble, Integer dateCreate, Integer dateToDelete) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.accessCode = accessCode;
        this.urlToAccess = urlToAccess;
        this.isAvaileble = isAvaileble;
        this.dateCreate = dateCreate;
        this.dateToDelete = dateToDelete;
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getAccessCode() {
        return this.accessCode;
    }

    public void setAccessCode(Integer accessCode) {
        this.accessCode = accessCode;
    }

    public String getUrlToAccess() {
        return this.urlToAccess;
    }

    public void setUrlToAccess(String urlToAccess) {
        this.urlToAccess = urlToAccess;
    }

    public Boolean isIsAvaileble() {
        return this.isAvaileble;
    }

    public Boolean getIsAvaileble() {
        return this.isAvaileble;
    }

    public void setIsAvaileble(Boolean isAvaileble) {
        this.isAvaileble = isAvaileble;
    }

    public Integer getDateCreate() {
        return this.dateCreate;
    }

    public void setDateCreate(Integer dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Integer getDateToDelete() {
        return this.dateToDelete;
    }

    public void setDateToDelete(Integer dateToDelete) {
        this.dateToDelete = dateToDelete;
    }
}
