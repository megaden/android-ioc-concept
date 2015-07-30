package com.mediaparts.androidiocconcept.core.ui;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseActivityComponent;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseAppComponent;

public abstract class BaseActivity extends android.app.Activity {
    private IBaseActivityComponent activityComponent;

    public <T extends IBaseActivityComponent> T getActivityComponent() {
        return (T) activityComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = createActivityComponent();
    }

    protected <T extends IBaseAppComponent> T getAppComponent() {
        return (T) ((BaseApplication) getApplication()).getAppComponent();
    }

    protected void addFragment(int containerViewId, BaseFragment fragment) {
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(containerViewId, fragment);
        fragmentTransaction.commit();
    }

    protected abstract IBaseActivityComponent createActivityComponent();
}
