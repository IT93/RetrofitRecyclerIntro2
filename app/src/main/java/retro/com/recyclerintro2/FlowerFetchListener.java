package retro.com.recyclerintro2;

import java.util.List;

/**
 * Created by WeltesDev on 12/27/2017.
 */

public interface FlowerFetchListener {

    void onDeliverAllFlowers(List<Flower> flowers);

    void onDeliverFlower(Flower flower);

    void onHideDialog();
}
