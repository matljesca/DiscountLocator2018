package com.air.ws.core;

import java.util.ArrayList;

import air18.foi.hr.database.entities.Discount;
import air18.foi.hr.database.entities.Store;

public abstract class DataLoader {
    private ArrayList<Store> stores;
    private ArrayList<Discount> discounts;

    protected DataLoadedListener mDataLoadedListener;

    public void loadData(DataLoadedListener dataLoadedListener){
        this.mDataLoadedListener = dataLoadedListener;
    }

    public boolean dataLoaded(){
        if(stores == null || discounts == null){
            return false;
        }
        else{
            return true;
        }
    }
}
