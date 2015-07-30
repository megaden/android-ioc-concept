package com.mediaparts.androidiocconcept.core.ui;

import android.os.Bundle;

import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseActivityComponent;
import com.mediaparts.androidiocconcept.core.ui.ioc.components.IBaseFragmentComponent;

public abstract class BaseFragment extends android.app.Fragment {
    private IBaseFragmentComponent fragmentComponent;

    public <T extends IBaseFragmentComponent> T getFragmentComponent() {
        return (T) fragmentComponent;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentComponent = createFragmentComponent();
    }

    protected <T extends IBaseActivityComponent> T getActivityComponent() {
        return (T) ((BaseActivity) getActivity()).getActivityComponent();
    }

    protected abstract IBaseFragmentComponent createFragmentComponent();
}
