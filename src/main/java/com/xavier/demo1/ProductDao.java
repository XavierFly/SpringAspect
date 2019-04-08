package com.xavier.demo1;

public class ProductDao {
    public void save() {
        System.out.println("save");
    }

    public String update() {
        System.out.println("update");
        return "update";
    }

    public void delete() {
        System.out.println("delete");
    }

    public void findOne() {
        System.out.println("findOne");
        // System.out.println(1 / 0);
    }

    public void findAll() {
        System.out.println("findAll");
    }
}
