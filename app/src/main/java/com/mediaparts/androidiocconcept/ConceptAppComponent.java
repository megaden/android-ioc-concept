package com.mediaparts.androidiocconcept;

import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseAppComponent;

import javax.inject.Singleton;
import dagger.Component;

@Singleton @Component(modules = {ConceptAppModule.class})
public interface ConceptAppComponent extends IBaseAppComponent {
    IAppService getAppService();
}
