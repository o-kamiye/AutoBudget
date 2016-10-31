package ng.com.tinweb.www.autobudget;


import android.os.Bundle;
import android.support.v7.app.ActionBar;

public class SettingsActivity extends AppCompatPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActionBar();
        setContentView(R.layout.user_settings);

        getFragmentManager().beginTransaction()
                .replace(R.id.settings_container, new SettingsFragment())
                .commit();
    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
