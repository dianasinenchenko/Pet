package com.diana.pet.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Diana on 24.06.2019.
 */

public class Booking {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("mobile_number")
    @Expose
    private String mobileNumber;
    @SerializedName("booking_date")
    @Expose
    private String bookingDate;
    @SerializedName("booking_time")
    @Expose
    private String bookingTime;
    @SerializedName("booking_location_name")
    @Expose
    private String bookingLocationName;
    @SerializedName("booking_location_place")
    @Expose
    private String bookingLocationPlace;
    @SerializedName("booking_location_lat_lng")
    @Expose
    private String bookingLocationLatLng;

    public Booking(String id, String userName, String mobileNumber, String bookingDate, String bookingTime, String bookingLocationName, String bookingLocationPlace, String bookingLocationLatLng) {
        this.id = id;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.bookingLocationName = bookingLocationName;
        this.bookingLocationPlace = bookingLocationPlace;
        this.bookingLocationLatLng = bookingLocationLatLng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getBookingLocationName() {
        return bookingLocationName;
    }

    public void setBookingLocationName(String bookingLocationName) {
        this.bookingLocationName = bookingLocationName;
    }

    public String getBookingLocationPlace() {
        return bookingLocationPlace;
    }

    public void setBookingLocationPlace(String bookingLocationPlace) {
        this.bookingLocationPlace = bookingLocationPlace;
    }

    public String getBookingLocationLatLng() {
        return bookingLocationLatLng;
    }

    public void setBookingLocationLatLng(String bookingLocationLatLng) {
        this.bookingLocationLatLng = bookingLocationLatLng;
    }
}
