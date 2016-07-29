package com.cognizant.ngtmobtest.api.command.exception;

import com.cognizant.ngtmobtest.api.command.Command;

public class AdbShellCommandExecutionException extends CommandExecutionException {
    private static final String ERROR_MESSAGE = "Error while executing command: %s";

    private static final long serialVersionUID = -503890452151627952L;

    public AdbShellCommandExecutionException(Command command, Throwable cause) {
        super(String.format(ERROR_MESSAGE, command.getFormattedCommand()), cause);
    }

}
