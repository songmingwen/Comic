package com.song.sunset.fragments;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.song.sunset.R;
import com.song.sunset.adapters.TVListAdapter;
import com.song.sunset.beans.TV;

import java.util.ArrayList;

/**
 * Created by Song on 2016/9/1 0001.
 * Email:z53520@qq.com
 */
@Route(path="/song/video/tv")
public class TVListFragment extends Fragment {

    private RecyclerView recyclerView;
    private TVListAdapter adapter;
    private ArrayList<TV> tvArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tvArrayList = new ArrayList<>();
        TV tv_1 = new TV("CCTV3-综艺HD", "http://ivi.bupt.edu.cn/hls/cctv3hd.m3u8");
        TV tv_2 = new TV("CCTV6-电影HD", "http://ivi.bupt.edu.cn/hls/cctv6hd.m3u8");
        TV tv_4 = new TV("架子鼓", "http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4");
//        TV tv_5 = new TV("新闻", "rtmp://live.hkstv.hk.lxdns.com/live/hks");
        tvArrayList.add(tv_1);
        tvArrayList.add(tv_2);
        tvArrayList.add(tv_4);
//        tvArrayList.add(tv_5);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tv_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.id_tv_list_recycler);
        adapter = new TVListAdapter(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter.setData(tvArrayList);
    }
}
