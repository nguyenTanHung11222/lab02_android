package com.example.ongk;

public class Phone {
    private String name;
    private int gia;
    private int img;

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }

    public int getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Phone(String name, int gia, int img) {
        this.name = name;
        this.gia = gia;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", gia=" + gia +
                ", img=" + img +
                '}';
    }
}
