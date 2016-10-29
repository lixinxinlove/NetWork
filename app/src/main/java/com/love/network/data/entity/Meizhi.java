package com.love.network.data.entity;

import org.greenrobot.greendao.annotation.Entity;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lixinxin on 2016/10/28.
 */
@Entity()
public class Meizhi extends BaseEntity{

    private String url;
    private String type;
    private String desc;
    private String who;
    private boolean used;
    private Date createdAt;
    private Date updatedAt;
    private Date publishedAt;
    private int imageWidth;
    private int imageHeight;

    @Generated(hash = 274008258)
    public Meizhi(String url, String type, String desc, String who, boolean used,
            Date createdAt, Date updatedAt, Date publishedAt, int imageWidth,
            int imageHeight) {
        this.url = url;
        this.type = type;
        this.desc = desc;
        this.who = who;
        this.used = used;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    @Generated(hash = 846466209)
    public Meizhi() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public boolean getUsed() {
        return this.used;
    }
}
