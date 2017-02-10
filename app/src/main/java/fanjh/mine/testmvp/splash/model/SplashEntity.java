package fanjh.mine.testmvp.splash.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fanjh on 2017/2/9.
 */
public class SplashEntity implements Parcelable{
    private int time;
    private String url;

    public SplashEntity() {
    }

    protected SplashEntity(Parcel in) {
        time = in.readInt();
        url = in.readString();
    }

    public static final Creator<SplashEntity> CREATOR = new Creator<SplashEntity>() {
        @Override
        public SplashEntity createFromParcel(Parcel in) {
            return new SplashEntity(in);
        }

        @Override
        public SplashEntity[] newArray(int size) {
            return new SplashEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(time);
        dest.writeString(url);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getUrl() {
        return null == url ? "" : url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
