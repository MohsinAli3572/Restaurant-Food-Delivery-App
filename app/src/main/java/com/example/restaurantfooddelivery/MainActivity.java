package com.example.restaurantfooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantfooddelivery.adapter.BestForYouAdapter;
import com.example.restaurantfooddelivery.adapter.NearByAdapter;
import com.example.restaurantfooddelivery.model.BestForYou;
import com.example.restaurantfooddelivery.model.NearBy;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView bestForYouRecycler, nearByRecycler;
    BestForYouAdapter bestForYouAdapter;
    NearByAdapter nearByAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<BestForYou> bestForYouList = new ArrayList<>();
        bestForYouList.add(new BestForYou("Pasta", 3.9F, "30", "$50", R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou("Biryani", 4.2F, "40", "$30", R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou("Singapore Rice", 4.5F, "50", "$60$", R.drawable.bestforyou3));
        bestForYouList.add(new BestForYou("Pasta", 3.9F, "30", "$50", R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou("Biryani", 4.2F, "40", "$30", R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou("Singapore Rice", 4.5F, "50", "$60$", R.drawable.bestforyou3));

        setBestForYouRecycler(bestForYouList);

        List<NearBy> nearByList = new ArrayList<>();
        nearByList.add(new NearBy("35 min", R.drawable.nearby, "Crave"));
        nearByList.add(new NearBy("30 min", R.drawable.nearby, "Grand City Hotel"));
        nearByList.add(new NearBy("15 min", R.drawable.nearby, "KFC"));

        setNearByRecycler(nearByList);
    }

    private void setBestForYouRecycler(List<BestForYou> bestForYouList){

        bestForYouRecycler = findViewById(R.id.best_for_you_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        bestForYouRecycler.setLayoutManager(layoutManager);
        bestForYouAdapter = new BestForYouAdapter(this, bestForYouList);
        bestForYouRecycler.setAdapter(bestForYouAdapter);

    }

    private void setNearByRecycler(List<NearBy> nearByList){
        nearByRecycler = findViewById(R.id.near_by_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        nearByRecycler.setLayoutManager(layoutManager);
        nearByAdapter = new NearByAdapter(this, nearByList);
        nearByRecycler.setAdapter(nearByAdapter);
    }


}