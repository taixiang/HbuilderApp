package com.video.util;


public interface DataView
{
    public void  onGetDataFailured(String msg, String requestTag);
    public void  onGetDataSuccess(String result, String requestTag);
}
