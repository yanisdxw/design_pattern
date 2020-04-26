package com.dxw.design.creational.factory.factory;

//产生什么类完全由子类决定
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
