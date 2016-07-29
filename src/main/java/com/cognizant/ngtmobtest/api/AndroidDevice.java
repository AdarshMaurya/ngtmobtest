package com.cognizant.ngtmobtest.api;

import com.cognizant.ngtmobtest.api.file.FileInfo;

import java.io.File;
import java.util.List;

public interface AndroidDevice {
    String executeCommand(String command);

    List<FileInfo> list(String path);

    void openUrl(String url);

    void pullFile(String remoteFrom, File localTo);

    void pushFile(File localFrom, String remoteTo);
}
