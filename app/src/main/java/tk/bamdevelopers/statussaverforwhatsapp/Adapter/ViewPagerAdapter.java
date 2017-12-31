package tk.bamdevelopers.statussaverforwhatsapp.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import tk.bamdevelopers.statussaverforwhatsapp.Fragment.CardFragment;
import tk.bamdevelopers.statussaverforwhatsapp.Fragment.ImageFragment;
import tk.bamdevelopers.statussaverforwhatsapp.Fragment.SavedFragment;
import tk.bamdevelopers.statussaverforwhatsapp.Fragment.VideoFragment;
import tk.bamdevelopers.statussaverforwhatsapp.R;

/**
 * Created by malavan on 02/12/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    private static final int TOTAL_FRAGEMENT_COUNT=2;

    private Context mContext;
    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {

            case 0: return new ImageFragment();
            case 1: return new VideoFragment();
            case 2: return new SavedFragment();
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {

            case 0: return mContext.getString(R.string.images) ;
            case 1: return mContext.getString(R.string.Videos);
            case 2: return mContext.getString(R.string.Saved);
            default: return null;
        }

    }


    @Override
    public int getCount()
    {
        return 3;
    }
}
