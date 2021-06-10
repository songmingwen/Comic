package com.song.sunset.phoenix.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Song on 2017/4/11 0011.
 * E-mail: z53520@qq.com
 */
public class PhoenixLiveExt implements Parcelable {

    private String hasVideo;
    private String hasVr;
    private String startTime;
    private String status;//1:即将开始  2:正在直播  3:结束直播
    private String startStamp;
    private String endStamp;

    public long getStartTimeMillis() {
        try {
            // 后端当前所给的时间单位是 s，故需要转化成ms。
            return Long.valueOf(startStamp) * 1000;
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    public String getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(String hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getHasVr() {
        return hasVr;
    }

    public void setHasVr(String hasVr) {
        this.hasVr = hasVr;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartStamp() {
        return startStamp;
    }

    public void setStartStamp(String startStamp) {
        this.startStamp = startStamp;
    }

    public String getEndStamp() {
        return endStamp;
    }

    public void setEndStamp(String endStamp) {
        this.endStamp = endStamp;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hasVideo);
        dest.writeString(this.hasVr);
        dest.writeString(this.startTime);
        dest.writeString(this.status);
        dest.writeString(this.startStamp);
        dest.writeString(this.endStamp);
    }

    public PhoenixLiveExt() {
    }

    protected PhoenixLiveExt(Parcel in) {
        this.hasVideo = in.readString();
        this.hasVr = in.readString();
        this.startTime = in.readString();
        this.status = in.readString();
        this.startStamp = in.readString();
        this.endStamp = in.readString();
    }

    public static final Parcelable.Creator<PhoenixLiveExt> CREATOR = new Parcelable.Creator<PhoenixLiveExt>() {
        @Override
        public PhoenixLiveExt createFromParcel(Parcel source) {
            return new PhoenixLiveExt(source);
        }

        @Override
        public PhoenixLiveExt[] newArray(int size) {
            return new PhoenixLiveExt[size];
        }
    };
}
