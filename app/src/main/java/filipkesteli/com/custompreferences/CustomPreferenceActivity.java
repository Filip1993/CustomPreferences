package filipkesteli.com.custompreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class CustomPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView mi ne treba...
        //setContentView(R.layout.activity_custom_preference);

        //beginaj Transaction, replaceaj mi globalni content i zamijeni mi ga s fragmentom i commitaj mi ga...
        //Hostanje fragmenta:
        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new CustomPreferencesFragment())
                .commit();
    }
}
