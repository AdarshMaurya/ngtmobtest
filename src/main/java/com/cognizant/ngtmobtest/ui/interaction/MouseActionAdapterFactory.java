package com.cognizant.ngtmobtest.ui.interaction;

import com.cognizant.ngtmobtest.api.injector.Injector;
import com.cognizant.ngtmobtest.ui.JPanelScreen;

public final class MouseActionAdapterFactory {
    public static MouseActionAdapter getInstance(JPanelScreen jPanelScreen) {
        return new MouseActionAdapter(jPanelScreen);
    }

    public static MouseActionAdapter getInstance(JPanelScreen jPanelScreen, Injector injector) {
        return new MouseActionAdapter(jPanelScreen, injector);
    }
}
