package com.xys.model;

/**
 * Created by Administrator on 2018/2/8.
 */
public class Audotorium {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void turnOnLights(){
        System.out.println("开灯");
    }
    public void  turnOffLights(){
        System.out.println("关灯");
    }

    @Override
    public String toString() {
        return "Audotorium{" +
                "id=" + id +
                '}';
    }
}
