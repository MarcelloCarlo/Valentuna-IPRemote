package dev.adobongbangus.valentunaremotej;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adobong Bangus on 12/1/2017.
 */

public class DeviceManagerPage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View deviceManagerView = inflater.inflate(R.layout.devicemanager_tab, container, false);
        return deviceManagerView;
    }
}
