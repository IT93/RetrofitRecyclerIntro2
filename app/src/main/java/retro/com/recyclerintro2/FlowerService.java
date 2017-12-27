package retro.com.recyclerintro2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by WeltesDev on 12/27/2017.
 */

public interface FlowerService {

    @GET("/feeds/flowers.json")
    Call<List<Flower>> getAllFlowers();
}