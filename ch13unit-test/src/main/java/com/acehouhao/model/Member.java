package com.acehouhao.model;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class Member {
    private int id;
    private String name;

    public Member(int idArg, String nameArg) {
        this.id = idArg;
        this.name = nameArg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
