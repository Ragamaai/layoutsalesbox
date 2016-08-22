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
import com.example.ramsraga.salesbox.model.ModelAccountsCard;
import com.example.ramsraga.salesbox.model.ModelCalllistsCard;

import java.util.ArrayList;
import java.util.List;

public class CalllistsAdapter extends ArrayAdapter<ModelCalllistsCard> {
    public static List<ModelCalllistsCard> cardList = new ArrayList<>();
    int textViewResourceId;
    CardViewHolder viewHolder;
    private Context mcontext;

    public CalllistsAdapter(Context context, int textViewResourceId) {

        super(context, textViewResourceId);
        mcontext = context;
        this.textViewResourceId = textViewResourceId;
    }


    @Override
    public void add(ModelCalllistsCard object) {
        cardList.add(object);
        super.add(object);
    }

    static class CardViewHolder {
        TextView line1;
        TextView line2;
        ImageView line3;
        TextView line4;
        TextView line5;
        TextView line6;
        TextView line7;
        TextView line8;
        TextView line9;
        TextView line10;
        ImageView line11;
        TextView line12;
        ImageView line13;
        TextView line14;
        ImageView line15;
        TextView line16;
        ImageView line17;
        TextView line18;
    }


    @Override
    public int getCount() {
        return this.cardList.size();
    }

    @Override
    public ModelCalllistsCard getItem(int index) {
        return this.cardList.get(index);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity) mcontext).getLayoutInflater();
            row = inflater.inflate(textViewResourceId, parent, false);
            viewHolder = new CardViewHolder();
            viewHolder.line1 = (TextView) row.findViewById(R.id.trrrrr);
            viewHolder.line2 = (TextView) row.findViewById(R.id.nounit);
            viewHolder.line3 = (ImageView) row.findViewById(R.id.profileimage);
            viewHolder.line4 = (TextView) row.findViewById(R.id.bar);
            viewHolder.line5 = (TextView) row.findViewById(R.id.deadline);
            viewHolder.line6 = (TextView) row.findViewById(R.id.notset);
            viewHolder.line7 = (TextView) row.findViewById(R.id.accounts);
            viewHolder.line8 = (TextView) row.findViewById(R.id.accountsnmbr);
            viewHolder.line9 = (TextView) row.findViewById(R.id.contacts);
            viewHolder.line10 = (TextView) row.findViewById(R.id.contactsnmbr);
            viewHolder.line11 = (ImageView) row.findViewById(R.id.callog_imageg);
            viewHolder.line12 = (TextView) row.findViewById(R.id.calloggnmbr);
            viewHolder.line13 = (ImageView) row.findViewById(R.id.callog_imager);
            viewHolder.line14 = (TextView) row.findViewById(R.id.callognmbrr);
            viewHolder.line15 = (ImageView) row.findViewById(R.id.img_calendar);
            viewHolder.line16 = (TextView) row.findViewById(R.id.calnmbr);
            viewHolder.line17 = (ImageView) row.findViewById(R.id.img_moneybag);
            viewHolder.line18 = (TextView) row.findViewById(R.id.moneynmbr);


            row.setTag(viewHolder);
        } else {
            viewHolder = (CardViewHolder) row.getTag();
        }
        final int pos = position + 1;
        ModelCalllistsCard card = getItem(position);
        viewHolder.line1.setText((card.getLine1()));
        viewHolder.line2.setText(card.getLine2());
        viewHolder.line3.setImageResource((card.getLine3()));
        viewHolder.line4.setText((card.getLine4()));
        viewHolder.line5.setText(card.getLine5());
        viewHolder.line6.setText((card.getLine6()));
        viewHolder.line7.setText(card.getLine7());
        viewHolder.line8.setText((card.getLine8()));
        viewHolder.line9.setText(card.getLine9());
        viewHolder.line10.setText((card.getLine10()));
        viewHolder.line11.setImageResource(card.getLine11());
        viewHolder.line12.setText(card.getLine12());
        viewHolder.line13.setImageResource(card.getLine13());
        viewHolder.line14.setText(card.getLine14());
        viewHolder.line15.setImageResource(card.getLine15());
        viewHolder.line16.setText(card.getLine16());
        viewHolder.line17.setImageResource(card.getLine17());
        viewHolder.line18.setText(card.getLine18());


        return row;
    }

}