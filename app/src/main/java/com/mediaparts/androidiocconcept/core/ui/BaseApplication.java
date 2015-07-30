package com.mediaparts.androidiocconcept.core.ui;

import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseAppComponent;

public abstract class BaseApplication extends android.app.Application {
    private IBaseAppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = createAppComponent();
    }

    public IBaseAppComponent getAppComponent() {
        return appComponent;
    }

    protected abstract IBaseAppComponent createAppComponent();
}
