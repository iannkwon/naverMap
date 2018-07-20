package iann.com.cumap;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPger = (ViewPager)findViewById(R.id.view_pager);
        TabLayout mTab = (TabLayout) findViewById(R.id.tabs);

        FragmentPagerAdapter mFragmentPagerAdapter = new FragPagerAdapter(
                getSupportFragmentManager());
        mViewPger.setAdapter(mFragmentPagerAdapter);
        mTab.setupWithViewPager(mViewPger);
    }
}
