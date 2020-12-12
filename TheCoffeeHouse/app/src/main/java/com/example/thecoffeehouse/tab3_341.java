package com.example.thecoffeehouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class tab3_341 extends Fragment {
    private View view;
    private orderScreen_341 orderScreen_341;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab3_341() {
    }
    public static tab3_341 newInstance(String param1, String param2) {
        tab3_341 fragment = new tab3_341();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab3,container,false);
        recycle_list();
        return view;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view.findViewById(R.id.doan_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen_341,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem_341> orderItem_341s = new ArrayList<>();
        orderItem_341s.add(new orderItem_341("BÁNH MÌ CHÀ BÔNG PHÔ MAI","32,000 đ",R.drawable.banhmi));
        orderItem_341s.add(new orderItem_341("BÔNG LAN TRỨNG MUỐI","29,000 đ",R.drawable.bonglan));
        orderItem_341s.add(new orderItem_341("Mousse Gấu Chocolate","39,000 đ",R.drawable.gau));
        orderItem_341s.add(new orderItem_341("Mousse Matcha","55,000 đ",R.drawable.capcha));
        orderItem_341s.add(new orderItem_341("BÁNH MÌ CHÀ BÔNG PHÔ MAI","32,000 đ",R.drawable.banhmi));
        orderItem_341s.add(new orderItem_341("BÔNG LAN TRỨNG MUỐI","29,000 đ",R.drawable.bonglan));
        orderItem_341s.add(new orderItem_341("Mousse Gấu Chocolate","39,000 đ",R.drawable.gau));
        orderItem_341s.add(new orderItem_341("Mousse Matcha","55,000 đ",R.drawable.capcha));
        orderAdapter_341 orderAdapter_341 =new orderAdapter_341(orderScreen_341, orderItem_341s,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter_341);
    }
}