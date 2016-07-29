package com.cognizant.ngtmobtest.ui.interaction;

import com.cognizant.ngtmobtest.api.injector.InputKeyEvent;

public final class KeyboardActionListenerFactory {
    public static KeyboardActionListener getInstance(InputKeyEvent inputKeyEvent) {
        return new KeyboardActionListener(inputKeyEvent.getCode());
    }
}
