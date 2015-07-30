package com.mediaparts.androidiocconcept.core.ui.ioc.modules;

import dagger.Module;
import dagger.Provides;

import com.mediaparts.androidiocconcept.core.ui.BaseActivity;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerActivity;

@Module
public abstract class BaseActivityModule {
    protected final BaseActivity activity;

    protected BaseActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides @PerActivity
    public BaseActivity getActivity() {
        return this.activity;
    }
}
