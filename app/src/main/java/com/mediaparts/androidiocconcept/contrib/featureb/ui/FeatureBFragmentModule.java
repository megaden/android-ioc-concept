package com.mediaparts.androidiocconcept.contrib.featureb.ui;

import com.mediaparts.androidiocconcept.contrib.services.FeatureBServiceImpl;
import com.mediaparts.androidiocconcept.contrib.services.IActivityService;
import com.mediaparts.androidiocconcept.contrib.services.IFeatureBService;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.modules.BaseFragmentModule;

import dagger.Module;
import dagger.Provides;

@Module
public class FeatureBFragmentModule extends BaseFragmentModule {
    public FeatureBFragmentModule(FeatureBFragment fragment) {
        super(fragment);
    }

    @Provides @PerFragment
    public IFeatureBService provideService(IActivityService activityService) {
        return new FeatureBServiceImpl(activityService);
    }
}
