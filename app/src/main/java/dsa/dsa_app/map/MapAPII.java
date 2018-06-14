package dsa.dsa_app.map;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface MapAPII {

    @GET("map/list/")
    Call<List<String>> getMapList();

    @GET("map/getbyname/")
    Call<Mapa> getMap(@Body String nombremapa);
}
