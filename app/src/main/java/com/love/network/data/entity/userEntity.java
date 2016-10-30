package com.love.network.data.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lixinxin on 2016/10/30.
 */
@Entity()
public class UserEntity extends BaseEntity {

    @Id(autoincrement = true)
    private Long _id;
    private Long id;
    private String userName;
    private int age;

    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    @Generated(hash = 1273145555)
    public UserEntity(Long _id, Long id, String userName, int age, String work) {
        this._id = _id;
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.work = work;
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
