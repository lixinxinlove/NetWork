package com.love.network.data.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lixinxin on 2016/10/30.
 */
@Entity()
public class UserEntity extends BaseEntity {

    @Id
    private Long id;
    private String userName;
    private int age;

    @Generated(hash = 685203964)
    public UserEntity(Long id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    @Generated(hash = 1433178141)
    public UserEntity() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
