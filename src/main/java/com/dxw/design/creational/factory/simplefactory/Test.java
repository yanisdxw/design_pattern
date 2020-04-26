package com.dxw.design.creational.factory.simplefactory;

/**应用层、客户端*/
public class Test {
    public static void main(String[] args) {
        //父类引用指向子类
        //Video v1 = new JavaVideo();
        //为了不让应用层代码依赖对应的类，把生产过程放到一个类里面
        //v1.produce();
        //只需要导factory包，不需要其他两个包
        VideoFactory videoFactory = new VideoFactory();
        Video v2 = videoFactory.getVideo("java");
        v2.produce();
    }

    /**在JDK中的使用：calendar*/
    /**JDBC*/
    // Class.forName("mysql.cj.xxxxx")
    /**logback*/
}
