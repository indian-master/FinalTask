package com.finalTask.tsk.domain;

import java.io.Serializable;

public class Entity implements Serializable {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
