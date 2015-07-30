package com.mediaparts.androidiocconcept;

import com.mediaparts.androidiocconcept.core.ui.BaseApplication;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseAppComponent;

public class ConceptApp extends BaseApplication {
    @Override
    protected IBaseAppComponent createAppComponent() {
        return DaggerConceptAppComponent.builder().conceptAppModule(new ConceptAppModule(this)).build();
    }
}
