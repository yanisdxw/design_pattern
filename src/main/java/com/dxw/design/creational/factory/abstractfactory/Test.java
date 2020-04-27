package com.dxw.design.creational.factory.abstractfactory;

/**
 * 【定义】抽象工厂提供了一个创建一系列相关或相互依赖对象的接口，无需指定具体的类
 * 【适用场景】1.客户端不依赖于 2.强调产品族 3.所有的产品以同样的接口出现，从而使客户端不依赖具体实现
 * 【优点】1.应用层代码隔离 2.产品族一起创建
 * 【缺点】扩展产品族不方便
 *
 * 产品等级+产品族 -->唯一确定一个产品
 * 客户端只需要关心工厂，应用层与具体产品解耦（只和产品对应的工厂关联）
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article javaArticle = courseFactory.getArticle();
        Video javaVideo = courseFactory.getVideo();
        //都是一个产品族
        javaArticle.produce();
        javaVideo.produce();
    }

    /**java.sql*/
}
