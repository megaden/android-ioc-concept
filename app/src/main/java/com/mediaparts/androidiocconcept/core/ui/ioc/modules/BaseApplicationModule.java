package com.mediaparts.androidiocconcept.core.ui.ioc.modules;

import android.content.Context;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

import com.mediaparts.androidiocconcept.core.ui.BaseApplication;

@Module
public abstract class BaseApplicationModule {
    protected final BaseApplication application;

    public BaseApplicationModule(BaseApplication application) {
        this.application = application;
    }

    @Provides @Singleton
    public Context provideAppContext() {
        return this.application;
    }
}
