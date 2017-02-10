package fanjh.mine.testmvp.splash.model;

import java.util.ArrayList;

import fanjh.mine.testmvp.api.utils.callback.OnMessageCallback;

/**
 * Created by fanjh on 2017/2/9.
 * MVP中的Model层，主要是和数据打交道
 */
public class SplashModel {

    public void getSplashs(OnMessageCallback<SplashEntity> callback){
        if(null != callback){
            callback.messageCallback(getData(),null);
        }
    }

    private ArrayList<SplashEntity> getData(){
        ArrayList<SplashEntity> list = new ArrayList<>();
        if(Math.random() > 0.5){
            SplashEntity entity = new SplashEntity();
            entity.setTime(10);
            entity.setUrl("你好！");
            list.add(entity);
        }
        return list;
    }

}
