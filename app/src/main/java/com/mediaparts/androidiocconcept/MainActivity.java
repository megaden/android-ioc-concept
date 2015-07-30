package com.mediaparts.androidiocconcept;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mediaparts.androidiocconcept.contrib.featurea.ui.FeatureAFragment;
import com.mediaparts.androidiocconcept.contrib.featureb.ui.FeatureBFragment;
import com.mediaparts.androidiocconcept.contrib.services.IActivityService;
import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.core.ui.BaseActivity;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseActivityComponent;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    @Inject IAppService appService;
    @Inject IActivityService activityService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.<MainActivityComponent>getActivityComponent().inject(this);
    }

    @Override
    protected IBaseActivityComponent createActivityComponent() {
        return DaggerMainActivityComponent.builder()
            .mainActivityModule(new MainActivityModule(this))
            .conceptAppComponent(this.<ConceptAppComponent>getAppComponent())
            .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings_a) {
            addFragment(R.id.fragment_container, new FeatureAFragment());
            return true;
        }
        if (id == R.id.action_settings_b) {
            addFragment(R.id.fragment_container, new FeatureBFragment());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
