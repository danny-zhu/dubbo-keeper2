package com.dubboclub.dk.admin.model;

/**
 * Created by bieber on 2015/6/3.
 */
public abstract class BasicModel {

    private long id;

    public BasicModel(long id) {
        this.id = id;
    }

    public BasicModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @java.lang.Override
    public String toString() {
        return "BasicModel{" +
                "id=" + id +
                '}';
    }
}
