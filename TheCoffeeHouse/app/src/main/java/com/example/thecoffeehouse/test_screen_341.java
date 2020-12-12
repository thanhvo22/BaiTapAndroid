package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class test_screen_341 extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem tab1,tab2,tab3;
    ViewPager viewPager;
    PagerAdapter_341 pagerAdapter341;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen_341);
        tabLayout = findViewById(R.id.tablayout);
        tab1 =findViewById(R.id.tab1);
        tab2 =findViewById(R.id.tab2);
        tab3 =findViewById(R.id.tab3);
        viewPager =findViewById(R.id.viewpaper);
        pagerAdapter341 = new PagerAdapter_341(getSupportFragmentManager(),tabLayout.getTabCount());
//        pagerAdapter = new com.example.thecoffeehouse.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter341);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerAdapter341.notifyDataSetChanged();
                } else if (tab.getPosition() == 1) {
                    pagerAdapter341.notifyDataSetChanged();
                } else if (tab.getPosition() == 2) {
                    pagerAdapter341.notifyDataSetChanged();
                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
//        bottomNavigationView.setSelectedItemId(R.id.delivery);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.news:
//                        startActivity(new Intent(getApplicationContext(),Home.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.delivery:
////                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
////                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.store:
//                        startActivity(new Intent(getApplicationContext(),store_screen.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.account:
//                        startActivity(new Intent(getApplicationContext(),account_screen.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                }
//                return false;
//            }
//        });
    }

}