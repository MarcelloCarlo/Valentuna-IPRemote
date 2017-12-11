package dev.adobongbangus.valentunaremotej;

/**
 * Created by Adobong Bangus on 12/1/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class WelcomePage extends Fragment {

    Button autoDiscoverbtn,manualInputbtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View welcomeView = inflater.inflate(R.layout.welcome_tab, container, false);
        autoDiscoverbtn = welcomeView.findViewById(R.id.btnAutoDiscoverDevice);
        manualInputbtn = welcomeView.findViewById(R.id.btnAddDeviceManual);

      autoDiscoverbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //alert dialog for searching devices

          }
      });

      manualInputbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //manual input
          }
      });

        return welcomeView;
    }
}
