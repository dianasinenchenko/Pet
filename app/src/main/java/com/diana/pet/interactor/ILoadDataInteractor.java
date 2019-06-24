package com.diana.pet.interactor;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by Diana on 24.06.2019.
 */

public interface ILoadDataInteractor {

    Single<List> loadData();
}
