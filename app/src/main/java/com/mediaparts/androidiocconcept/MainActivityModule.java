package com.mediaparts.androidiocconcept;

import dagger.Module;
import dagger.Provides;

import com.mediaparts.androidiocconcept.MainActivity;
import com.mediaparts.androidiocconcept.contrib.services.ActivityServiceImpl;
import com.mediaparts.androidiocconcept.contrib.services.IActivityService;
import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerActivity;
import com.mediaparts.androidiocconcept.core.ui.ioc.modules.BaseActivityModule;

@Module
public class MainActivityModule extends BaseActivityModule {
    public MainActivityModule(MainActivity activity) {
        super(activity);
    }

    @Provides @PerActivity
    public IActivityService provideActivityService(IAppService appService) {
        return new ActivityServiceImpl(appService);
    }
}
