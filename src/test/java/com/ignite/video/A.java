package com.ignite.video;

import java.util.Objects;

public class A implements Cloneable{

    private String name;
    private String account;

    public A(String name, String account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return  false;
        }
        A a = (A) obj;
        return this.name==a.name&&this.account==a.account;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name,account);
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    @Override
    protected A clone() {
        A a = null;
        try {
            a = (A) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return a;
    }
}
