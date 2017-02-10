package fanjh.mine.testmvp.api.utils.callback;

import java.util.ArrayList;

public interface OnMessageCallback<T>{
    void messageCallback(ArrayList<T> list,String hint);
}