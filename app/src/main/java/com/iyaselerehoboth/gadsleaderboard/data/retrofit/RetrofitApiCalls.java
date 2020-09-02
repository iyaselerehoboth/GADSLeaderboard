package com.iyaselerehoboth.gadsleaderboard.data.retrofit;

import com.iyaselerehoboth.gadsleaderboard.data.models.LearningLeaders;
import com.iyaselerehoboth.gadsleaderboard.data.models.SkillLeaders;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiCalls {

    @GET("/api/hours")
    Call<List<LearningLeaders>> getLearningLeaders();

    @GET("/api/skilliq")
    Call<List<SkillLeaders>> getSkillLeaders();
}
