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
 * Created by developer on 01/11/17.
 */

public class AdapterRecylerView extends RecyclerView.Adapter<AdapterRecylerView.ViewHolder>{

    private List<NObjeto> nObjetos;
    private Context context;
    private onItemClicklistener onItemClicklistener;

    public interface onItemClicklistener {
        void onItemClick(NObjeto nObjeto);
    }

    public AdapterRecylerView(List<NObjeto> nObjetos, Context context,onItemClicklistener onItemClicklistener) {
        this.nObjetos = nObjetos;
        this.context = context;
        this.onItemClicklistener =  onItemClicklistener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uber_eat,null);
        AdapterRecylerView.ViewHolder viewHolder = new AdapterRecylerView.ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


      NObjeto  nObjeto = nObjetos.get(position);
      holder.bind(nObjeto, onItemClicklistener);
      holder.texto1.setText("ISAI");
      holder.texto2.setText("ñlñlsñlañslañslas");


    }

    @Override
    public int getItemCount() {
        return nObjetos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView texto1;
        TextView texto2;

        public ViewHolder(View itemView) {
            super(itemView);

            texto1 =  itemView.findViewById(R.id.textView3);
            texto2 =  itemView.findViewById(R.id.texview4);
        }

        public void bind(final NObjeto nObjeto, final onItemClicklistener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(nObjeto);
                }
            });

        }
    }




}
