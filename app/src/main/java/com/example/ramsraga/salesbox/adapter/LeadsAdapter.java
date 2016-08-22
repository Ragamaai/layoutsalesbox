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
import com.example.ramsraga.salesbox.model.ModelAnnouncementCard;
import com.example.ramsraga.salesbox.model.ModelLeadsCard;

import java.util.ArrayList;
import java.util.List;

public class LeadsAdapter extends ArrayAdapter<ModelLeadsCard> {
public static List<ModelLeadsCard> cardList = new ArrayList<>();
        int textViewResourceId;
        CardViewHolder viewHolder;
private Context mcontext;

public LeadsAdapter(Context context, int textViewResourceId) {

        super(context, textViewResourceId);
        mcontext = context;
        this.textViewResourceId = textViewResourceId;
        }


@Override
public void add(ModelLeadsCard object) {
        cardList.add(object);
        super.add(object);
        }

static class CardViewHolder {
    ImageView line1;
    TextView line2;
    TextView line3;
    TextView line4;
    TextView line5;
    TextView line6;
    ImageView line7;
}


    @Override
    public int getCount() {
        return this.cardList.size();
    }

    @Override
    public ModelLeadsCard getItem(int index) {
        return this.cardList.get(index);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity) mcontext).getLayoutInflater();
            row = inflater.inflate(textViewResourceId, parent, false);
            viewHolder = new CardViewHolder();
            viewHolder.line1 = (ImageView) row.findViewById(R.id.lead_image);
            viewHolder.line2 = (TextView) row.findViewById(R.id.date);
            viewHolder.line3 = (TextView) row.findViewById(R.id.time);
            viewHolder.line4 = (TextView) row.findViewById(R.id.name);
            viewHolder.line5 = (TextView) row.findViewById(R.id.gmail);
            viewHolder.line6 = (TextView) row.findViewById(R.id.interestin);
            viewHolder.line7 = (ImageView) row.findViewById(R.id.profileimage);

            row.setTag(viewHolder);
        } else {
            viewHolder = (CardViewHolder) row.getTag();
        }
        final int pos = position + 1;
        ModelLeadsCard card = getItem(position);
        viewHolder.line1.setImageResource(card.getLine1());
        viewHolder.line1.setSelected(true);
        viewHolder.line2.setText(card.getLine2());
        viewHolder.line3.setText(card.getLine3());
        viewHolder.line4.setText(card.getLine4());
        viewHolder.line5.setText(card.getLine5());
        viewHolder.line6.setText(card.getLine6());
        viewHolder.line7.setImageResource(card.getLine7());
        return row;
    }
}
