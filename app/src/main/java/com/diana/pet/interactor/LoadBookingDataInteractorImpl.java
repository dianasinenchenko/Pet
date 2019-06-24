package com.diana.pet.interactor;

import com.diana.pet.data.repository.BookingRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by Diana on 24.06.2019.
 */

public class LoadBookingDataInteractorImpl implements ILoadDataInteractor {

    private final BookingRepository bookingRepository;

    @Inject
    public LoadBookingDataInteractorImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Single<List> loadData() {
        return bookingRepository;
    }
}
