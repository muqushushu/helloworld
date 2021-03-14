package com.test.helloworld;

import java.util.List;

public class TestBean {

    /**
     * data : 2021
     * list : [{"name":"123","age":"23"},{"name":"123","age":"23"},{"name":"123","age":"23"}]
     * age : true
     * isn : 23
     */

    private String data;
    private List<ListDTO> list;
    private boolean age;
    private int isn;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ListDTO> getList() {
        return list;
    }

    public void setList(List<ListDTO> list) {
        this.list = list;
    }

    public boolean isAge() {
        return age;
    }

    public void setAge(boolean age) {
        this.age = age;
    }

    public int getIsn() {
        return isn;
    }

    public void setIsn(int isn) {
        this.isn = isn;
    }

    public static class ListDTO {
        /**
         * name : 123
         * age : 23
         */

        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
