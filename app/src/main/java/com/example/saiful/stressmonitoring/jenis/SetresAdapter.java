package com.example.saiful.stressmonitoring.jenis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saiful.stressmonitoring.R;
import com.example.saiful.stressmonitoring.jenis.Setres;

import java.util.ArrayList;

public class SetresAdapter extends BaseAdapter {
    private Context context;

    public void setSetress(ArrayList<Setres> setress) {
        this.setress = setress;
    }

    public SetresAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Setres> setress = new ArrayList<>();

    @Override
    public int getCount() {
        return setress.size();
    }

    @Override
    public Object getItem(int i) {
        return setress.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_setres, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);

        Setres setres = (Setres) getItem(i);
        viewHolder.bind(setres);
        return itemView;
    }
    private class ViewHolder{
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view){
            txtName = view.findViewById(R.id.tv_name);
            txtDescription = view.findViewById(R.id.tv_description);
            imgPhoto = view.findViewById(R.id.img_photo);

        }
        void bind(Setres setres){
            txtName.setText(setres.getName());
            txtDescription.setText(setres.getDescription());
            imgPhoto.setImageResource(setres.getPhoto());
        }
    }
}
