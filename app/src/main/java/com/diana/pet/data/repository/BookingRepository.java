package com.diana.pet.data.repository;

import com.diana.pet.data.model.Booking;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Diana on 24.06.2019.
 */

public class BookingRepository {


    public Single<List> getBookingData(){

        return Single.just();

    }
}
