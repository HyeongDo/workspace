package com.example.rxjava_retrofit_recyclerview_cardview_practice;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubApi {
    @GET("users/{owner}/repos")
    Single<List<GithubRepo>> getRepos(@Path("owner") String owner);
}
