package tk.bamdevelopers.statussaverforwhatsapp.Fragment;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jsibbold.zoomage.ZoomageView;

import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.R;

public class GalleryViewFragment extends Fragment {

    Uri mUri;
    int position;
    ImageView vIImage;

    public GalleryViewFragment() {
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_gallery_view, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vIImage = (ImageView) view.findViewById(R.id.gallery_image);
        mUri = ((Uri)getArguments().getParcelable("uri"));




    }

    @Override
    public void onStart() {
        super.onStart();
        Glide.with(getActivity()).load(mUri).into(vIImage);
    }


}
