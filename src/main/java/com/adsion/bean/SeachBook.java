package com.adsion.bean;

public class SeachBook {
    private int offset;
    private int limit;
    private int size;
    private int total;

    private String title;
    private String book_time_start;
    private String book_time_end;

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

    public String getBook_time_start() {
        return book_time_start;
    }

    public void setBook_time_start(String book_time_start) {
        this.book_time_start = book_time_start;
    }

    public String getBook_time_end() {
        return book_time_end;
    }

    public void setBook_time_end(String book_time_end) {
        this.book_time_end = book_time_end;
    }
}
