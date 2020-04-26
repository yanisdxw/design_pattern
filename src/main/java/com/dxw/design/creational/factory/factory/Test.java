package com.dxw.design.creational.factory.factory;

/**
 * 【定义】定义一个创建对象的接口，但让实现这个接口的类决定实例化哪个类。工厂方法让类的实例化【推迟到子类的实现中】
 * 【适用场景】1.创建对象需要大量重复的代码 2.客户端不依赖产品类如何被创建的细节 3.一个类通过子类来指定创建那个对象
 * 客户端无需关心是哪一个工厂子类创建对象
 * 【优点】1. 用户只需要关心产品对应的工厂无需关心细节 2、符合开闭环原则，便于扩展
 * 【缺点】类的个数多，增加抽象性与理解难度
 * */

/**
 * 【产品族】：python与pythonFactory，java与JavaFactory
 * 【产品等级】：python与java， pythonFactory与JavaFactory
 * */
public class Test {

    public static void main(String[] args) {
        //由工厂类决定生成什么对象,修改直接替换工厂类即可
        //VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory vf1 = new PythonVideoFactory();
        VideoFactory vf2 = new JavaVideoFactory();
        VideoFactory vf3 = new FEVideoFactory();
        Video video = vf1.getVideo();
        video.produce();
    }

    /**
     * Collecion 集合类 collection是抽象工厂，arrayList是具体工厂，arrayList下的iterator是具体产品
     * Logback
     * */
}
