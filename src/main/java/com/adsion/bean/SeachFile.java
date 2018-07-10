package com.adsion.bean;

public class SeachFile {
    private int offset;
    private int limit;
    private int size;
    private int total;

    private int cust_id;
    private String title;
    private String create_time_start;
    private String create_time_end;
    private String type;

    @Override
    public String toString() {
        return "SeachFile{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", size=" + size +
                ", total=" + total +
                ", cust_id=" + cust_id +
                ", title='" + title + '\'' +
                ", create_time_start='" + create_time_start + '\'' +
                ", create_time_end='" + create_time_end + '\'' +
                ", type='" + type + '\'' +
                '}';
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

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreate_time_start() {
        return create_time_start;
    }

    public void setCreate_time_start(String create_time_start) {
        this.create_time_start = create_time_start;
    }

    public String getCreate_time_end() {
        return create_time_end;
    }

    public void setCreate_time_end(String create_time_end) {
        this.create_time_end = create_time_end;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
