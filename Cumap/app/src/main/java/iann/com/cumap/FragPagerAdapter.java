package iann.com.cumap;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragPagerAdapter extends FragmentPagerAdapter {
    public FragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return HomeFragment.newInstance();
            case 1:
                return MapFragment.newInstance();
            case 2:
                return SearchFragment.newInstance();
            case 3:
                return MyFragment.newInstance();
            default:
                return null;
        }
    }

    private  static int PAGE_NUMBER = 4;
    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Map";
            case 2:
                return "Search";
            case 3:
                return "My";
            default:
                return null;
        }
    }
}
