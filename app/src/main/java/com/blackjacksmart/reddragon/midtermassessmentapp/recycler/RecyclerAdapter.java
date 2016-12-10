package com.blackjacksmart.reddragon.midtermassessmentapp.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blackjacksmart.reddragon.midtermassessmentapp.R;

/**
 * Created by RedDragon on 12/10/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View vineView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vine_viewholder, null);
        return new ViewHolder(vineView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        ((ViewHolder) holder).bind(((Data)
//               dataRecords.get(position)), position);
    }

    @Override
    public int getItemCount() {
        return 10;
    } // should be retrofitData.size()
}