package fanjh.mine.testmvp.tab.model;

import android.content.Context;
import android.net.Network;

import java.util.ArrayList;

import fanjh.mine.testmvp.api.cache.DiskCache;
import fanjh.mine.testmvp.api.cache.MemoryCache;
import fanjh.mine.testmvp.api.network.NetworkRequest;
import fanjh.mine.testmvp.api.utils.callback.OnMessageCallback;
import fanjh.mine.testmvp.api.utils.callback.OnRequestCallback;
import fanjh.mine.testmvp.config.Const;

/**
 * Created by fanjh on 2017/2/9.
 */
public class NewsModel {
    private Context mContext;
    private MemoryCache mMemoryCache;
    private DiskCache mDiskCache;

    public NewsModel(Context mContext) {
        this.mContext = mContext;
        mMemoryCache = new MemoryCache();
        mDiskCache = new DiskCache();
    }

    public void getNewsMessage(final OnMessageCallback<News> callback) {
        if(null == callback){
            return;
        }
        final ArrayList<News> newses = getNewsByCache();
        if (null == newses) {
            getNewsByNetwork(new OnRequestCallback() {
                @Override
                public void onError(String text) {
                    callback.messageCallback(null,text);
                }

                @Override
                public void onSuccess() {
                    callback.messageCallback(newses,null);
                }
            });
        }else{
            callback.messageCallback(newses,null);
        }
    }

    private void getNewsByNetwork(OnRequestCallback callback) {
        NetworkRequest.sendRequest(callback);
    }

    private ArrayList<News> getNewsByCache() {
        Object memoryObject = mMemoryCache.getObject(Const.NewsConst.CACHE_KEY);
        if (null != memoryObject) {
            return (ArrayList<News>) memoryObject;
        }
        memoryObject = mDiskCache.getObject(Const.NewsConst.CACHE_KEY);
        if (null != memoryObject) {
            return (ArrayList<News>) memoryObject;
        }
        //return null;
        ArrayList<News> result = new ArrayList<News>();
        for(int i=0;i<Math.random() * 15;++i) {
            result.add(new News());
        }
        return result;
    }

}
