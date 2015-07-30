package com.mediaparts.androidiocconcept;

import dagger.Module;
import dagger.Provides;

import com.mediaparts.androidiocconcept.contrib.services.AppServiceImpl;
import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.core.ui.ioc.modules.BaseApplicationModule;

import javax.inject.Singleton;

@Module
public class ConceptAppModule extends BaseApplicationModule {
    public ConceptAppModule(ConceptApp application) {
        super(application);
    }

    @Provides @Singleton
    public IAppService provideAppService() {
        return new AppServiceImpl();
    }
}
