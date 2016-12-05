package com.example.hp.volcanahualt;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Owner on 05/11/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewHoler> implements View.OnClickListener {

    List<String> dataSource;
    Activity mActivity;
    private View.OnClickListener listener;

    public ListAdapter(Activity activity, List<String> fuenteDeDatos) {
        dataSource = fuenteDeDatos;
        mActivity = activity;
    }

    //infla_item
    public CustomViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHoler customViewHoler = new CustomViewHoler(view);
        view.setOnClickListener(this);
        return customViewHoler;
    }
        //Establecer los valores
    @Override
    public void onBindViewHolder(CustomViewHoler holder, int position) {
        holder.txtview.setText(dataSource.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    @Override
    public void onClick(View view) {
        if(listener != null)
            listener.onClick(view);
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }


    class CustomViewHoler extends RecyclerView.ViewHolder  {
        public TextView txtview;

        public CustomViewHoler(View itemView) {
            super(itemView);
            txtview = (TextView) itemView.findViewById(R.id.texto);

        }


    }
}

