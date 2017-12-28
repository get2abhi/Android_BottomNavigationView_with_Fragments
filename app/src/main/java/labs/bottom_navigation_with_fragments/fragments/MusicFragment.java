package labs.bottom_navigation_with_fragments.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import labs.bottom_navigation_with_fragments.R;

/**
 * Created by abhinav.srivastava on 12/28/17.
 */

public class MusicFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.music_fragment, container, false);
    }
}
