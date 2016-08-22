package com.example.ramsraga.salesbox.adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.widget.TextView;


import com.example.ramsraga.salesbox.model.ModelAnnouncementCard;
import com.example.ramsraga.salesbox.R;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementsAdapter extends ArrayAdapter<ModelAnnouncementCard> {
    public static List<ModelAnnouncementCard> cardList = new ArrayList<>();
    int textViewResourceId;
    CardViewHolder viewHolder;
    private Context mcontext;

    public AnnouncementsAdapter(Context context, int textViewResourceId) {

        super(context, textViewResourceId);
        mcontext = context;
        this.textViewResourceId = textViewResourceId;
    }


    @Override
    public void add(ModelAnnouncementCard object) {
        cardList.add(object);
        super.add(object);
    }

    static class CardViewHolder {
        TextView line1;
        TextView line2;
        TextView line3;
        TextView line4;
        ImageView line5;
        TextView line6;
        TextView line7;
        TextView line8;
        TextView line9;
        TextView line10;
        TextView line11;
        ImageView line12;
        TextView line13;
        ImageView line14;
        TextView line15;
        ImageView line16;
        TextView line17;
    }


    @Override
    public int getCount() {
        return this.cardList.size();
    }

    @Override
    public ModelAnnouncementCard getItem(int index) {
        return this.cardList.get(index);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity) mcontext).getLayoutInflater();
            row = inflater.inflate(textViewResourceId, parent, false);
            viewHolder = new CardViewHolder();
            viewHolder.line1 = (TextView) row.findViewById(R.id.month);
            viewHolder.line2 = (TextView) row.findViewById(R.id.name);
            viewHolder.line3 = (TextView) row.findViewById(R.id.opportunity);
            viewHolder.line4 = (TextView) row.findViewById(R.id.create);
            viewHolder.line5 = (ImageView) row.findViewById(R.id.profileimage);
            viewHolder.line6 = (TextView) row.findViewById(R.id.value);
            viewHolder.line7 = (TextView) row.findViewById(R.id.valuenmbr);
            viewHolder.line8 = (TextView) row.findViewById(R.id.weight);
            viewHolder.line9 = (TextView) row.findViewById(R.id.weightnmbr);
            viewHolder.line10 = (TextView) row.findViewById(R.id.profit);
            viewHolder.line11 = (TextView) row.findViewById(R.id.profitnmbr);
            viewHolder.line12 = (ImageView) row.findViewById(R.id.img_profile);
            viewHolder.line13 = (TextView) row.findViewById(R.id.imgprofilenmbr);
            viewHolder.line14 = (ImageView) row.findViewById(R.id.img_check);
            viewHolder.line15 = (TextView) row.findViewById(R.id.checknmbr);
            viewHolder.line16 = (ImageView) row.findViewById(R.id.img_calendar);
            viewHolder.line17 = (TextView) row.findViewById(R.id.calnmbr);
            row.setTag(viewHolder);
        } else {
            viewHolder = (CardViewHolder) row.getTag();
        }
        final int pos = position + 1;
        ModelAnnouncementCard card = getItem(position);
        viewHolder.line1.setText(card.getLine1());
        viewHolder.line1.setSelected(true);
        viewHolder.line2.setText(card.getLine2());
        viewHolder.line3.setText(card.getLine3());
        viewHolder.line4.setText(card.getLine4());
        viewHolder.line5.setImageResource(card.getLine5());
        viewHolder.line6.setText(card.getLine6());
        viewHolder.line7.setText(card.getLine7());
        viewHolder.line8.setText(card.getLine8());
        viewHolder.line9.setText(card.getLine9());
        viewHolder.line10.setText(card.getLine10());
        viewHolder.line11.setText(card.getLine11());
        viewHolder.line12.setImageResource(card.getLine12());
        viewHolder.line13.setText(card.getLine13());
        viewHolder.line14.setImageResource(card.getLine14());
        viewHolder.line15.setText(card.getLine15());
        viewHolder.line16.setImageResource(card.getLine16());
        viewHolder.line17.setText(card.getLine17());


        return row;
    }
}