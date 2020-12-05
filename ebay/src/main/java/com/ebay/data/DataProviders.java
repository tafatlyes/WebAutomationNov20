package com.ebay.data;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider(name = "searchData")
    public Object [] getSearchData(){
        return new Object[]{"Java books","Selenium books"," Data structure books"};
    }
}
