package air18.foi.hr.discountlocator.loaders;

import com.air.ws.core.DataLoadedListener;
import com.air.ws.core.DataLoader;

import java.util.ArrayList;
import java.util.logging.Logger;

import air18.foi.hr.database.entities.Discount;
import air18.foi.hr.database.entities.Store;

public class DbDataLoader extends DataLoader {
    @Override
    public void loadData(DataLoadedListener dataLoadedListener) {
        super.loadData(dataLoadedListener);
        try{
            stores = (ArrayList<Store>) Store.getAll();
            discounts = (ArrayList<Discount>) Discount.getAll();

            mDataLoadedListener.onDataLoaded(stores, discounts);

        }catch (NullPointerException e){
            Logger.getLogger("context", String.valueOf(e));
        }
    }
}
