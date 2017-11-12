package com.mossoveterinary.dogar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mossoveterinary.dogar.R;
import com.mossoveterinary.dogar.models.NObjeto;

import java.util.List;

/**
 * Created by developer on 06/11/17.
 */

public class AdapterRecyclerViewScroll extends RecyclerView.Adapter<AdapterRecyclerViewScroll.ViewHolder> {
     private List<NObjeto> nObjetoList;
     private Context context;


    public AdapterRecyclerViewScroll(List<NObjeto> nObjetoList, Context context) {
        this.nObjetoList = nObjetoList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_scroll,null);
        AdapterRecyclerViewScroll.ViewHolder viewHolder = new AdapterRecyclerViewScroll.ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NObjeto nObjeto = nObjetoList.get(position);
        holder.usuario.setText("@imosso");
        holder.comentario.setText("Comentario del otro usuario que lo realizo");
    }

    @Override
    public int getItemCount() {
        return nObjetoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       private TextView usuario;
       private TextView comentario;

        public ViewHolder(View itemView) {
            super(itemView);
            usuario = (TextView)itemView.findViewById(R.id.txtUsuario);
            comentario =  (TextView)itemView.findViewById(R.id.txtComentario);

        }
    }
}
