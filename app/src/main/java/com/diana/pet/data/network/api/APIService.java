package com.diana.pet.data.network.api;

import com.diana.pet.data.model.Booking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * Created by Diana on 24.06.2019.
 */

public interface APIService {

    @GET(".../Booking")
    List<List<Booking>> getBookingData();

    @GET("WebApi/api/Monitoring_KIP")
    Call<Booking> getBookingById(@Query("id") int idBooking);

    @PUT("WebApi/api/SKZ/")
    @FormUrlEncoded
    Call<Booking> setBooking(
            @Field("id") String id,
            @Field("user_name") String userName,
            @Field("mobile_number") String mobileNumber,
            @Field("booking_date") String bookingDate,
            @Field("booking_time") String bookingTime,
            @Field("booking_location_name") String bookingLocationName,
            @Field("booking_location_place") String bookingLocationPlace,
            @Field("booking_location_lat_lng") String bookingLocationLatLng
    );
}
