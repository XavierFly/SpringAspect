package com.xavier.demo2;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public String update() {
        System.out.println("update");
        return "update";
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void findOne() {
        System.out.println("findOne");
        // System.out.println(1 / 0);
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }
}
