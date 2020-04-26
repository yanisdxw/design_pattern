package com.dxw.design.creational.factory.factory;

public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("创建前端视频");
    }
}
