package com.adsion.bean;

public class BookInfo {
    private int id;
    private String title;
    private String description;
    private String book_time;
    private String create_time;
    private int count;

    @Override
    public String toString() {
        return "BookInfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", book_time='" + book_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", count=" + count +
                '}';
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = description;
    }

    public String getBook_time() {
        return book_time;
    }

    public void setBook_time(String book_time) {
        this.book_time = book_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
