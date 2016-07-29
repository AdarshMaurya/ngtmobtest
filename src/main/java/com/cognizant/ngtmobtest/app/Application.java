package com.cognizant.ngtmobtest.app;

public interface Application {

    void close();

    void handleException(Thread thread, Throwable ex);

    void start();

    void init();
}
