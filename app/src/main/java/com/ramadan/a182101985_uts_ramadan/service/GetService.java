package com.ramadan.a182101985_uts_ramadan.service;

import com.ramadan.a182101985_uts_ramadan.model.User;
import com.ramadan.a182101985_uts_ramadan.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
