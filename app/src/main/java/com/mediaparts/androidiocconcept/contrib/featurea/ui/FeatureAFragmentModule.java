package com.mediaparts.androidiocconcept.contrib.featurea.ui;

import dagger.Module;
import dagger.Provides;

import com.mediaparts.androidiocconcept.contrib.services.FeatureAServiceImpl;
import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.contrib.services.IFeatureAService;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.modules.BaseFragmentModule;

@Module
public class FeatureAFragmentModule extends BaseFragmentModule {
    public FeatureAFragmentModule(FeatureAFragment fragment) {
        super(fragment);
    }

    @Provides @PerFragment
    public IFeatureAService provideService(IAppService appService) {
        return new FeatureAServiceImpl(appService);
    }
}
