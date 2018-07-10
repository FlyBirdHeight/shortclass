package com.adsion.bean;

public class SeachLog {
    private int offset;
    private int limit;
    private int size;
    private int total;

    private String title;
    private String create_time_start;
    private String create_time_end;

    @Override
    public String toString() {
        return "SeachLog{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", size=" + size +
                ", total=" + total +
                ", title='" + title + '\'' +
                ", create_time_start='" + create_time_start + '\'' +
                ", create_time_end='" + create_time_end + '\'' +
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
}
