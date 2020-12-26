package com.xucz.ffleaning;

/**
 * Function:
 *
 * @author xucz
 * @since 12/26/20
 */
public class FFmpegTest {
    static{
        System.loadLibrary("learn-ffmpeg");
    }

    public static String GetFFmpegVersion(){
        return native_GetFFmpegVersion();
    }

    private static native String native_GetFFmpegVersion();

}
