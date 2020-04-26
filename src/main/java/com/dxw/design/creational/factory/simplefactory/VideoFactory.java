package com.dxw.design.creational.factory.simplefactory;

public class VideoFactory {
    public Video getVideo(String type){
        if("java".equals(type)){
            return new JavaVideo();
        }else if("python".equals(type)){
            return new PythonVideo();
        }else {
            return null;
        }
    }

    //为了增加可扩展性，可使用反射改造：
    public Video getVedio(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
