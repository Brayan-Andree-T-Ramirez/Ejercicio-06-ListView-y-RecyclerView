package com.upiiz.dm_batrb_06.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.upiiz.dm_batrb_06.R;
import com.upiiz.dm_batrb_06.model.User;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {


    private Context ctx;

    private ArrayList<User> listaUsuarios;
    public CustomAdapter(Context ctx, ArrayList<User> listaUsuarios){
        this.ctx = ctx;
        this.listaUsuarios = listaUsuarios;

    }

    @Override
    public int getCount() {
        return listaUsuarios.size();
    }

    @Override
    public Object getItem(int position) {
        return listaUsuarios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Comprobar que hay una instancia de convertView
        if(convertView==null){
            convertView = LayoutInflater.from(ctx).inflate(R.layout.custom_list_item,parent,false);
        }

        TextView tvUser = convertView.findViewById(R.id.tvUser);
        TextView tvUltimoMensaje = convertView.findViewById(R.id.tvUltimoMensaje);
        TextView tvUltimaConexion = convertView.findViewById(R.id.tvUltimaConexion);
        ImageView ivUser = convertView.findViewById(R.id.ivUser);

        tvUser.setText(listaUsuarios.get(position).getNombre());
        tvUltimoMensaje.setText(listaUsuarios.get(position).getUtimoMensaje());
        tvUltimaConexion.setText(listaUsuarios.get(position).getUltimaConexion());
        ivUser.setImageResource(listaUsuarios.get(position).getImagen());

        return convertView;
    }
}
