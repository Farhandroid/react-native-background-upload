package com.vydia.RNUploader;

public class BackGroundUploadConstant {

    private static Integer PORT = 0;
    private static String PASSWORD = "";
    private static String PROXY = "";
    private static String USERNAME = "";

    // Getters
    public static Integer getPort() {
        return PORT;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static String getProxy() {
        return PROXY;
    }

    public static String getUsername() {
        return USERNAME;
    }

    // Setters
    public static void setPort(Integer port) {
        PORT = port;
    }

    public static void setPassword(String password) {
        PASSWORD = password;
    }

    public static void setProxy(String proxy) {
        PROXY = proxy;
    }

    public static void setUsername(String username) {
        USERNAME = username;
    }
}

