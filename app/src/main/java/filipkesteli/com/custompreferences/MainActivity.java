package filipkesteli.com.custompreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPreferences(View view) {
        Intent intent = new Intent(this, CustomPreferenceActivity.class);
        startActivity(intent);
    }

    public void setNickname(View view) {
        //idemo pisat po file-u iz shared preferences:
        EditText etNick = (EditText) findViewById(R.id.etNickName);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("nickname", etNick.getText().toString());
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        if (sp.contains("nickname")) {
            EditText etNick = (EditText) findViewById(R.id.etNickName);
            String nickname = sp.getString("nickname", null);
            etNick.setText(nickname);
        }
    }
}
