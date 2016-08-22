package com.example.ramsraga.salesbox.adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramsraga.salesbox.R;
import com.example.ramsraga.salesbox.model.ModelForecastCard;
import com.example.ramsraga.salesbox.model.ModelTimelineCard;

import java.util.ArrayList;
import java.util.List;

public class ForecastAdapter extends ArrayAdapter<ModelForecastCard> {
    public static List<ModelForecastCard> cardList = new ArrayList<>();
    int textViewResourceId;
    CardViewHolder viewHolder;
    private Context mcontext;

    public ForecastAdapter(Context context, int textViewResourceId) {

        super(context, textViewResourceId);
        mcontext = context;
        this.textViewResourceId = textViewResourceId;
    }


    @Override
    public void add(ModelForecastCard object) {
        cardList.add(object);
        super.add(object);
    }

    static class CardViewHolder {
        ImageView line1;
        TextView line2;
        TextView line3;
        TextView line4;
        ImageView line5;
    }


    @Override
    public int getCount() {
        return this.cardList.size();
    }

    @Override
    public ModelForecastCard getItem(int index) {
        return this.cardList.get(index);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity) mcontext).getLayoutInflater();
            row = inflater.inflate(textViewResourceId, parent, false);
            viewHolder = new CardViewHolder();
            viewHolder.line1 = (ImageView) row.findViewById(R.id.profileimage);
            viewHolder.line2 = (TextView) row.findViewById(R.id.forecast);
            viewHolder.line3 = (TextView) row.findViewById(R.id.overview);
            viewHolder.line4 = (TextView) row.findViewById(R.id.testing);
            viewHolder.line5 = (ImageView) row.findViewById(R.id.check);

            row.setTag(viewHolder);
        } else {
            viewHolder = (CardViewHolder) row.getTag();
        }
        final int pos = position + 1;
        ModelForecastCard card = getItem(position);
        viewHolder.line1.setImageResource(card.getLine1());
        viewHolder.line1.setSelected(true);
        viewHolder.line2.setText(card.getLine2());
        viewHolder.line3.setText(card.getLine3());
        viewHolder.line4.setText(card.getLine4());
        viewHolder.line5.setImageResource(card.getLine5());
        return row;
    }
}