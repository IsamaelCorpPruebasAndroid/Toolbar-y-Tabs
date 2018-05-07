package midoriya.toolbarytabs.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import midoriya.toolbarytabs.Fragments.FirtsFragment;
import midoriya.toolbarytabs.Fragments.SecondFragment;
import midoriya.toolbarytabs.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter{

    private int numberOfTabs;

    public PagerAdapter(FragmentManager fm,int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FirtsFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
