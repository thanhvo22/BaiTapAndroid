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

public class tab2_341 extends Fragment {
    private View view;
    private orderScreen_341 orderScreen_341;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab2_341() {
    }
    public static tab2_341 newInstance(String param1, String param2) {
        tab2_341 fragment = new tab2_341();
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
        view = inflater.inflate(R.layout.fragment_tab2,container,false);
        recycle_list();
        return view;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view.findViewById(R.id.thucuong_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen_341,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem_341> orderItem_341s = new ArrayList<>();
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_1));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_1));
        orderItem_341s.add(new orderItem_341("TRÀ OOLONG BƯỞI MẬT ONG","50,000 đ",R.drawable.product_1));
        orderItem_341s.add(new orderItem_341("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG","45,000 đ",R.drawable.product_2));
        orderItem_341s.add(new orderItem_341("TRÀ ĐÀO CAM SẢ","45,000 đ",R.drawable.product_3));
        orderItem_341s.add(new orderItem_341("CARAMEL MACCHIATO","55,000 đ",R.drawable.product_4));
        orderItem_341s.add(new orderItem_341("MOCHA","49,000 đ",R.drawable.product_5));
        orderItem_341s.add(new orderItem_341("CAPPUCCINO","45,000 đ",R.drawable.product_6));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_7));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_9));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_11));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_11));
        orderItem_341s.add(new orderItem_341("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderAdapter_341 orderAdapter_341 =new orderAdapter_341(orderScreen_341, orderItem_341s,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter_341);
    }
}