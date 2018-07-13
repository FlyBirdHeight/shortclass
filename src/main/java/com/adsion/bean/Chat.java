package com.adsion.bean;

public class Chat {
    private int id;
    private int cust_id;
    private Custor custor;
    private String name;
    private String dept;
    private String position;
    private String telephone;
    private String mobile;
    private String email;
    private String qq;
    private String degree;
    private String info;
    private String create_time;
    private String cust_bame;
    private int count;

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", cust_id=" + cust_id +
                ", custor=" + custor +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", position='" + position + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", degree='" + degree + '\'' +
                ", info='" + info + '\'' +
                ", create_time='" + create_time + '\'' +
                ", cust_bame='" + cust_bame + '\'' +
                ", count=" + count +
                '}';
    }

    public String getCust_bame() {
        return cust_bame;
    }

    public void setCust_bame(String cust_bame) {
        this.cust_bame = cust_bame;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public Custor getCustor() {
        return custor;
    }

    public void setCustor(Custor custor) {
        this.custor = custor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
