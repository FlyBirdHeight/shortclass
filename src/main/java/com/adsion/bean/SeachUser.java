package com.adsion.bean;

public class SeachUser {
    private String name;
    private String sex;
    private String birthday_start;
    private String birthday_end;
    private int role_id;
    private int status;

    private int offset;
    private int limit;
    private int size;
    private int total;

    @Override
    public String toString() {
        return "SeachUser{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday_start='" + birthday_start + '\'' +
                ", birthday_end='" + birthday_end + '\'' +
                ", role_id=" + role_id +
                ", status='" + status + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                ", size=" + size +
                ", total=" + total +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday_start() {
        return birthday_start;
    }

    public void setBirthday_start(String birthday_start) {
        this.birthday_start = birthday_start;
    }

    public String getBirthday_end() {
        return birthday_end;
    }

    public void setBirthday_end(String birthday_end) {
        this.birthday_end = birthday_end;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
