package com.example.stephen.traveland.Rest;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;


public interface Api {
    @GET("/index-updated.json")
    void listRepos(Callback<BossModel> callback);

    @GET("/countries/cta-cap-{country}.json")
    void getCountry(@Path("country") String countryIso, Callback<VPModel> callback);
}
