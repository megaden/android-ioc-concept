package com.mediaparts.androidiocconcept.contrib.featurea.ui;

import com.mediaparts.androidiocconcept.MainActivityComponent;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseFragmentComponent;

import dagger.Component;

@PerFragment @Component(dependencies = {MainActivityComponent.class}, modules = {FeatureAFragmentModule.class})
public interface FeatureAFragmentComponent extends IBaseFragmentComponent {
    void inject(FeatureAFragment fragment);
}
