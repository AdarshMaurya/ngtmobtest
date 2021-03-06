package com.cognizant.ngtmobtest.api.command;

import com.cognizant.ngtmobtest.api.injector.InputKeyEvent;

public class KeyCommand extends InputCommand {
    private int code;
    private boolean longpress;

    public KeyCommand(int keyCode) {
        this.code = keyCode;
    }

    public KeyCommand(InputKeyEvent inputKeyEvent) {
        code = inputKeyEvent.getCode();
    }

    public KeyCommand(int keyCode, boolean longpress) {
        this(keyCode);
        this.longpress = longpress;
    }

    public KeyCommand(InputKeyEvent inputKeyEvent, boolean longpress) {
        this(inputKeyEvent);
        this.longpress = longpress;
    }

    public void setLongPress(boolean longpress) {
        this.longpress = longpress;
    }

    @Override
    protected String getCommandPart() {
        StringBuilder stringBuilder = new StringBuilder("keyevent");
        if (longpress) {
            stringBuilder.append(" --longpress");
        }
        stringBuilder.append(' ').append(code);
        return stringBuilder.toString();
    }

}
