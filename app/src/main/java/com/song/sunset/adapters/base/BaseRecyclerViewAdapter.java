package com.song.sunset.adapters.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.song.sunset.interfaces.OnRVItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Song on 2016/8/27 0027.
 * Email:z53520@qq.com
 */
public abstract class BaseRecyclerViewAdapter<RD, VH extends RecyclerView.ViewHolder> extends BaseRVAdapterWithoutVH<RD> {

    private OnRVItemClickListener onRVItemClickListener;

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return onCreatePersonalViewHolder(parent, viewType);
    }

    protected abstract VH onCreatePersonalViewHolder(ViewGroup parent, int viewType);

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        onBindPersonalViewHolder(holder, position);

        if (getItemClickState()) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClick(v, holder.getAdapterPosition());
                    if (onRVItemClickListener != null) {
                        onRVItemClickListener.onClick(v, holder.getAdapterPosition());
                    }
                }
            });
        }
    }

    /**
     * 需要对recyclerView的touch事件进行控制的时候，子类复写该方法，返回false；
     *
     * @return
     */
    protected boolean getItemClickState() {
        return true;
    }

    protected void onItemClick(View view, int position) {
    }

    protected abstract void onBindPersonalViewHolder(RecyclerView.ViewHolder holder, int position);

    public void setOnRVItemClickListener(OnRVItemClickListener onRVItemClickListener) {
        this.onRVItemClickListener = onRVItemClickListener;
    }
}
