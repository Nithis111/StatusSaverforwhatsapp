package tk.bamdevelopers.statussaverforwhatsapp.Adapter;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.Fragment.GalleryViewFragment;

/**
 * Created by malavan on 10/12/17.
 */

public class GalleryViewPager extends FragmentStatePagerAdapter {


    private List<Uri> mUriList;
    private int position;
    private GalleryViewFragment galleryViewFragment ;

    public GalleryViewPager(FragmentManager fm, List<Uri> mUriList) {
        super(fm);
        this.mUriList = mUriList;
        this.position = position;
    }



    @Override
    public Fragment getItem(int position) {
        galleryViewFragment = new GalleryViewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri",mUriList.get(position));
        galleryViewFragment.setArguments(bundle);
        return galleryViewFragment;
    }

    @Override
    public int getCount() {
        return mUriList.size();
    }

   }
