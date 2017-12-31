package tk.bamdevelopers.statussaverforwhatsapp.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mzelzoghbi.zgallery.ZGrid;
import com.mzelzoghbi.zgallery.entities.ZColor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.Adapter.ImagesAdapter;
import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.Utils.FileProvider;
import tk.bamdevelopers.statussaverforwhatsapp.Utils.UriGenerator;

/**
 * Created by malavan on 02/12/17.
 */

public class ImageFragment extends Fragment
{
    RecyclerView mRecylerViewImage;

    public ImageFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_images,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecylerViewImage = (RecyclerView)view.findViewById(R.id.recyclerview_image);
        mRecylerViewImage.setAdapter(new ImagesAdapter(FileProvider.getImageFiles(),getContext()));
        GridLayoutManager mLayout = new GridLayoutManager(getContext(),2);
        mRecylerViewImage.setLayoutManager(mLayout);
        mRecylerViewImage.setNestedScrollingEnabled(false);

    }

    @Override
    public void onResume() {
        super.onResume();

    }


    @Override
    public void onDestroyView() {
        mRecylerViewImage.setAdapter(null);
        super.onDestroyView();
    }

}
