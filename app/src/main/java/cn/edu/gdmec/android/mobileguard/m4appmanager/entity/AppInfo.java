package cn.edu.gdmec.android.mobileguard.m4appmanager.entity;

import android.content.pm.PermissionInfo;
import android.graphics.drawable.Drawable;

/**
 * Created by DONG on 2017/11/5.
 */

public class AppInfo {
    public String packageName;
    public Drawable icon;
    public String appName;
    public String apkPath;
    public long appSize;
    public boolean isInRoom;
    public boolean isUserApp;
    public boolean isSelected = false;

    public int appVersion;
    public long inStalldate;
    public PermissionInfo[] Permissions;
    public String apkbook;

    public String getAppLocation(boolean isInRoom){
        if (isInRoom){
            return "手机内存";
        }else{
            return "外部存储";
        }
    }
}