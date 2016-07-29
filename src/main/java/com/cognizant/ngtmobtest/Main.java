package com.cognizant.ngtmobtest;

import com.cognizant.ngtmobtest.app.AndroidScreencastApplication;
import com.cognizant.ngtmobtest.app.Application;
import com.cognizant.ngtmobtest.spring.config.ApplicationContextProvider;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String args[]) {
        LOGGER.debug("main(String[] args=" + Arrays.toString(args) + ") - start");
        Application application = ApplicationContextProvider.getApplicationContext()
                .getBean(AndroidScreencastApplication.class);
        application.init();
        application.start();

        LOGGER.debug("main(String[] args=" + Arrays.toString(args) + ") - end");
    }

}
