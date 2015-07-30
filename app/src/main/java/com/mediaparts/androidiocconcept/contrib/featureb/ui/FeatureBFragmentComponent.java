package com.mediaparts.androidiocconcept.contrib.featureb.ui;

import com.mediaparts.androidiocconcept.MainActivityComponent;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseFragmentComponent;

import dagger.Component;

@PerFragment @Component(dependencies = {MainActivityComponent.class}, modules = {FeatureBFragmentModule.class})
public interface FeatureBFragmentComponent extends IBaseFragmentComponent {
    void inject(FeatureBFragment fragment);
}
