package dev.adobongbangus.valentunaremotej;

/**
 * Created by Adobong Bangus on 12/1/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WelcomePage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.WelcomeTab, container, false);
        return rootView;
    }
}
