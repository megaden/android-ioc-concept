package com.mediaparts.androidiocconcept.contrib.featurea.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaparts.androidiocconcept.MainActivityComponent;
import com.mediaparts.androidiocconcept.R;
import com.mediaparts.androidiocconcept.contrib.services.IAppService;
import com.mediaparts.androidiocconcept.contrib.services.IFeatureAService;
import com.mediaparts.androidiocconcept.core.ui.BaseFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseFragmentComponent;

import javax.inject.Inject;

public class FeatureAFragment extends BaseFragment {
    @Inject IAppService appService;
    @Inject IFeatureAService featureService;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.<FeatureAFragmentComponent>getFragmentComponent().inject(this);
    }

    @Override
    protected IBaseFragmentComponent createFragmentComponent() {
        return DaggerFeatureAFragmentComponent.builder()
            .featureAFragmentModule(new FeatureAFragmentModule(this))
            .mainActivityComponent(this.<MainActivityComponent>getActivityComponent())
            .build();
    }
}
