package com.bobble.dexter.core;

public class Dexter {

    public enum BuildVariant {
        DEBUG, RELEASE
    }

    private static volatile Dexter mInstance;
    private String apkPath;
    private BuildVariant mVariant;
    private boolean signed;

    public static Dexter configure() {
        if (mInstance == null) {
            mInstance = new Dexter();
        }
        return mInstance;
    }

    public String getApkPath() {
        return apkPath;
    }

    public synchronized Dexter setApkPath(String apkPath) {
        this.apkPath = apkPath;
        return this;
    }

    public synchronized Dexter setIsSigned(boolean signed){
        this.signed = signed;
        return this;
    }


    public synchronized boolean isSigned() {
        return signed;
    }

    public synchronized Dexter setBuildVariant (BuildVariant variant) {
        this.mVariant = variant;
        return this;
    }

    public BuildVariant getVariant() {
        return mVariant;
    }


}
