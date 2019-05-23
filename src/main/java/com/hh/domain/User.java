package com.hh.domain;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/7 13:40
 **/
public class User {
    private Long userId;
    private String userName;
    private Character userSex;
    private List idsList;

    public List getIdsList() {
        return idsList;
    }

    public void setIdsList(List idsList) {
        this.idsList = idsList;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
