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
import com.example.ramsraga.salesbox.model.ModelAnnouncementCard;

import java.util.ArrayList;
import java.util.List;

public class AccountsAdapter extends ArrayAdapter<ModelAccountsCard> {
    public static List<ModelAccountsCard> cardList = new ArrayList<>();
    int textViewResourceId;
    CardViewHolder viewHolder;
    private Context mcontext;

    public AccountsAdapter(Context context, int textViewResourceId) {

        super(context, textViewResourceId);
        mcontext = context;
        this.textViewResourceId = textViewResourceId;
    }


    @Override
    public void add(ModelAccountsCard object) {
        cardList.add(object);
        super.add(object);
    }

    static class CardViewHolder {
        ImageView line1;
        TextView line2;
        ImageView line3;
        ImageView line4;
        TextView line5;
        ImageView line6;
        TextView line7;
        ImageView line8;
        TextView line9;
        ImageView line10;
        TextView line11;
        TextView line12;
        TextView line13;
        TextView line14;
        TextView line15;
        TextView line16;
        TextView line17;
        TextView line18;
        TextView line19;
    }


    @Override
    public int getCount() {
        return this.cardList.size();
    }

    @Override
    public ModelAccountsCard getItem(int index) {
        return this.cardList.get(index);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity) mcontext).getLayoutInflater();
            row = inflater.inflate(textViewResourceId, parent, false);
            viewHolder = new CardViewHolder();
            viewHolder.line1 = (ImageView) row.findViewById(R.id.accounts_image);
            viewHolder.line2 = (TextView) row.findViewById(R.id.name);
            viewHolder.line3 = (ImageView) row.findViewById(R.id.profileimage);
            viewHolder.line4 = (ImageView) row.findViewById(R.id.img_profile);
            viewHolder.line5 = (TextView) row.findViewById(R.id.imgprofilenmbr);
            viewHolder.line6 = (ImageView) row.findViewById(R.id.img_check);
            viewHolder.line7 = (TextView) row.findViewById(R.id.checknmbr);
            viewHolder.line8 = (ImageView) row.findViewById(R.id.img_calendar);
            viewHolder.line9 = (TextView) row.findViewById(R.id.calnmbr);
            viewHolder.line10 = (ImageView) row.findViewById(R.id.img_moneybag);
            viewHolder.line11 = (TextView) row.findViewById(R.id.moneynmbr);
            viewHolder.line12 = (TextView) row.findViewById(R.id.closedsales);
            viewHolder.line13 = (TextView) row.findViewById(R.id.closedsalesnmbr);
            viewHolder.line14 = (TextView) row.findViewById(R.id.closedprofit);
            viewHolder.line15 = (TextView) row.findViewById(R.id.closedprofitnmbr);
            viewHolder.line16 = (TextView) row.findViewById(R.id.value);
            viewHolder.line17 = (TextView) row.findViewById(R.id.valuenmbr);

            viewHolder.line18 = (TextView) row.findViewById(R.id.weight);
            viewHolder.line19 = (TextView) row.findViewById(R.id.weightnmbr);

            row.setTag(viewHolder);
        } else {
            viewHolder = (CardViewHolder) row.getTag();
        }
        final int pos = position + 1;
        ModelAccountsCard card = getItem(position);
        viewHolder.line1.setImageResource((card.getLine1()));
        viewHolder.line2.setText(card.getLine2());
        viewHolder.line3.setImageResource((card.getLine3()));
        viewHolder.line4.setImageResource((card.getLine4()));
        viewHolder.line5.setText(card.getLine5());
        viewHolder.line6.setImageResource((card.getLine6()));
        viewHolder.line7.setText(card.getLine7());
        viewHolder.line8.setImageResource((card.getLine8()));
        viewHolder.line9.setText(card.getLine9());
        viewHolder.line10.setImageResource((card.getLine10()));
        viewHolder.line11.setText(card.getLine11());
        viewHolder.line12.setText(card.getLine12());
        viewHolder.line13.setText(card.getLine13());
        viewHolder.line14.setText(card.getLine14());
        viewHolder.line15.setText(card.getLine15());
        viewHolder.line16.setText(card.getLine16());
        viewHolder.line17.setText(card.getLine17());
        viewHolder.line18.setText(card.getLine18());
        viewHolder.line19.setText(card.getLine19());

        return row;
    }

}