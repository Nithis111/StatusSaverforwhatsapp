package tk.bamdevelopers.statussaverforwhatsapp.Activity;

import android.content.Context;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.Adapter.GalleryViewPager;
import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.Utils.FileProvider;

public class GalleryActivity extends AppCompatActivity {


    private List<Uri> mUriList;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getString(R.string.images));

        mViewPager = findViewById(R.id.viewpager_gallery);


        GalleryViewPager galleryViewPager = new GalleryViewPager(getSupportFragmentManager(), FileProvider.getUri());



        mViewPager.setAdapter(galleryViewPager);
        mViewPager.setCurrentItem(getIntent().getExtras().getInt("position"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

         getMenuInflater().inflate(R.menu.menu_gallery,menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_item_save : //TODO: save photo
                                     return true;
            case R.id.menu_item_delete: //TODO: Delete photo
                                     return true;
            case R.id.menu_item_share: //TODO: Share photo;
                                     return true;
            case android.R.id.home:  super.onBackPressed();
                                     return true;
            default: return true;

        }
    }
}
