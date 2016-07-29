package com.cognizant.ngtmobtest.api.command;

public class TapCommand extends InputCommand {
    private int x;
    private int y;

    public TapCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected String getCommandPart() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tap ").append(x).append(' ').append(y);
        return stringBuilder.toString();
    }
}
