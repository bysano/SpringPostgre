package com.example;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: alka0317
 * Date: 4/18/17
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "user")
public class UserPojo implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    public UserPojo() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public UserPojo(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
           }

    @Override
    public String toString() {
        return "UserPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPojo userPojo = (UserPojo) o;

        if (id != userPojo.id) return false;
        if (name != null ? !name.equals(userPojo.name) : userPojo.name != null) return false;
        if (surname != null ? !surname.equals(userPojo.surname) : userPojo.surname != null) return false;

        return true;
    }



    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
