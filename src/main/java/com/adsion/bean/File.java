package com.adsion.bean;

public class File {
    private int id;
    private int cust_id;
    private Custor custor;
    private String title;
    private String description;
    private String type;
    private String url;
    private String create_time;
    private String cust_name;
    private int count;

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", cust_id=" + cust_id +
                ", custor=" + custor +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", create_time='" + create_time + '\'' +
                ", cust_name='" + cust_name + '\'' +
                ", count=" + count +
                '}';
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
