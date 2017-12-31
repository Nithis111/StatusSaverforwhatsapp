package tk.bamdevelopers.statussaverforwhatsapp.Fragment;

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

import java.io.File;
import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.Adapter.ImagesAdapter;
import tk.bamdevelopers.statussaverforwhatsapp.Adapter.VideoAdapter;
import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.Utils.FileProvider;

/**
 * Created by malavan on 02/12/17.
 */

public class VideoFragment extends Fragment {

    RecyclerView mRecylerViewImage;


    public VideoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_video,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("Hi","Video");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        mRecylerViewImage = (RecyclerView)view.findViewById(R.id.recyclerview_video);
        mRecylerViewImage.setAdapter(new VideoAdapter(FileProvider.getVideoFiles(),getContext()));


        GridLayoutManager mLayout = new GridLayoutManager(getActivity(),2);


        mRecylerViewImage.setLayoutManager(mLayout);

        mRecylerViewImage.setNestedScrollingEnabled(false);
    }
    @Override
    public void onDestroyView() {
        mRecylerViewImage.setAdapter(null);
        super.onDestroyView();
    }
}
