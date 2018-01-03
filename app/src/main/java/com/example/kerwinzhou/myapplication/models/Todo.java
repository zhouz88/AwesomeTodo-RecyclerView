package com.example.kerwinzhou.myapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by kerwinzhou on 1/2/18.
 */

public class Todo implements Parcelable {
    public String text;
    public Date remindDate;

    public Todo(String text, Date remindDate) {
        this.text = text;
        this.remindDate = remindDate;
    }


    protected Todo(Parcel in) {
        text = in.readString();
        long sDate = in.readLong();
        remindDate = (sDate == -1 ? null : new Date(sDate));
    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
         parcel.writeString(text);
         parcel.writeLong(remindDate != null ? remindDate.getTime() : -1);
    }
}
