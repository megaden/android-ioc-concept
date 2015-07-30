package com.mediaparts.androidiocconcept.core.ui.ioc.modules;

import dagger.Module;
import dagger.Provides;

import com.mediaparts.androidiocconcept.core.ui.BaseFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.PerFragment;

@Module
public abstract class BaseFragmentModule {
    protected final BaseFragment fragment;

    protected BaseFragmentModule(BaseFragment fragment) {
        this.fragment = fragment;
    }

    @Provides @PerFragment
    public BaseFragment getFragment() {
        return this.fragment;
    }
}
