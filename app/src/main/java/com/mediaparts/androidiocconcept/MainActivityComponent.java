package com.mediaparts.androidiocconcept;

import dagger.Component;

import com.mediaparts.androidiocconcept.contrib.services.IActivityService;
import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerActivity;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseActivityComponent;

@PerActivity @Component(dependencies = {ConceptAppComponent.class}, modules = {MainActivityModule.class})
public interface MainActivityComponent extends IBaseActivityComponent {
    void inject(MainActivity activity);

    IActivityService getActivityService();
    IAppService getAppService();
}
