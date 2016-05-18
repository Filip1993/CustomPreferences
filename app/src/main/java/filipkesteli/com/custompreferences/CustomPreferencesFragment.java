package filipkesteli.com.custompreferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by programer on 18.5.2016..
 */
public class CustomPreferencesFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //naloadao je preferences
        addPreferencesFromResource(R.xml.preferences);
        //ACTIVITY koji ce hostati ovaj xml moramo napraviti...
    }
}
