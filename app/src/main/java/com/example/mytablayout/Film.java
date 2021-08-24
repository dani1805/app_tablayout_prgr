package com.example.mytablayout;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {

    String title, year, country, gender, qualification, duration, synopsis;
    int photo;

    public Film(String title, String year, String country, String gender, String qualification, String duration, String synopsis, int photo) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.gender = gender;
        this.qualification = qualification;
        this.duration = duration;
        this.synopsis = synopsis;
        this.photo = photo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    protected Film(Parcel in) {
        photo = in.readInt();
        duration = in.readString();
        title = in.readString();
        year = in.readString();
        country = in.readString();
        gender = in.readString();
        qualification = in.readString();
        synopsis = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(photo);
        dest.writeString(year);
        dest.writeString(duration);
        dest.writeString(country);
        dest.writeString(gender);
        dest.writeString(qualification);
        dest.writeString(synopsis);


    }
}
