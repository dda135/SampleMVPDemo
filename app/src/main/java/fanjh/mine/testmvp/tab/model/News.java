package fanjh.mine.testmvp.tab.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fanjh on 2017/2/9.
 */
public class News implements Parcelable{
    private int id;
    private String title;
    private String content;
    private String imageUrl;
    private int readNum;

    public News() {
    }

    protected News(Parcel in) {
        id = in.readInt();
        title = in.readString();
        content = in.readString();
        imageUrl = in.readString();
        readNum = in.readInt();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(content);
        dest.writeString(imageUrl);
        dest.writeInt(readNum);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    public String getImageUrl() {
        return null == imageUrl ? "" : imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return null == content ? "" : content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return null == title ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
