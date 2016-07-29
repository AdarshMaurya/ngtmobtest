package com.cognizant.ngtmobtest.ui.interaction;

import com.cognizant.ngtmobtest.api.command.executor.CommandExecutor;
import com.cognizant.ngtmobtest.api.command.factory.AdbInputCommandFactory;
import com.cognizant.ngtmobtest.spring.config.ApplicationContextProvider;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyboardActionListener implements ActionListener {
    private CommandExecutor commandExecutor;
    private int key;

    public KeyboardActionListener(int key) {
        this.key = key;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                getCommandExecutor().execute(AdbInputCommandFactory.getKeyCommand(key));
            }
        });

    }

    private CommandExecutor getCommandExecutor() {
        if (commandExecutor == null) {
            commandExecutor = ApplicationContextProvider.getApplicationContext().getBean(CommandExecutor.class);
        }
        return commandExecutor;
    }

}
