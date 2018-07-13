package com.adsion.bean;

import java.util.Date;

public class Custor {
    private int id;
    private String name;
    private String type;
    private String background;
    private String listed;
    private int reg_capital;
    private int year_sales;
    private int entp_scale;
    private int tester_no;
    private String url;
    private String zip_code;
    private String address;
    private String main_products;
    private String major_services;
    private String status;
    private int user_id;
    private User user;
    private String create_time;
    private String user_name;
    private int count;

    @Override
    public String toString() {
        return "Custor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", background='" + background + '\'' +
                ", listed='" + listed + '\'' +
                ", reg_capital=" + reg_capital +
                ", year_sales=" + year_sales +
                ", entp_scale=" + entp_scale +
                ", tester_no=" + tester_no +
                ", url='" + url + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", address='" + address + '\'' +
                ", main_products='" + main_products + '\'' +
                ", major_services='" + major_services + '\'' +
                ", status='" + status + '\'' +
                ", user_id=" + user_id +
                ", user=" + user +
                ", create_time='" + create_time + '\'' +
                ", user_name='" + user_name + '\'' +
                ", count=" + count +
                '}';
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getListed() {
        return listed;
    }

    public void setListed(String listed) {
        this.listed = listed;
    }

    public int getReg_capital() {
        return reg_capital;
    }

    public void setReg_capital(int reg_capital) {
        this.reg_capital = reg_capital;
    }

    public int getYear_sales() {
        return year_sales;
    }

    public void setYear_sales(int year_sales) {
        this.year_sales = year_sales;
    }

    public int getEntp_scale() {
        return entp_scale;
    }

    public void setEntp_scale(int entp_scale) {
        this.entp_scale = entp_scale;
    }

    public int getTester_no() {
        return tester_no;
    }

    public void setTester_no(int tester_no) {
        this.tester_no = tester_no;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMain_products() {
        return main_products;
    }

    public void setMain_products(String main_products) {
        this.main_products = main_products;
    }

    public String getMajor_services() {
        return major_services;
    }

    public void setMajor_services(String major_services) {
        this.major_services = major_services;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
