package com.mediaparts.androidiocconcept.contrib.featureb.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaparts.androidiocconcept.MainActivityComponent;
import com.mediaparts.androidiocconcept.R;
import com.mediaparts.androidiocconcept.contrib.services.IActivityService;
import com.mediaparts.androidiocconcept.contrib.services.IFeatureBService;
import com.mediaparts.androidiocconcept.core.ui.BaseFragment;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseFragmentComponent;

import javax.inject.Inject;

public class FeatureBFragment extends BaseFragment {
    @Inject IActivityService activityService;
    @Inject IFeatureBService featureService;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.<FeatureBFragmentComponent>getFragmentComponent().inject(this);
    }

    @Override
    protected IBaseFragmentComponent createFragmentComponent() {
        return DaggerFeatureBFragmentComponent.builder()
            .featureBFragmentModule(new FeatureBFragmentModule(this))
            .mainActivityComponent(this.<MainActivityComponent>getActivityComponent())
            .build();
    }
}
