package com.wolfcstech.brotli_android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.netease.hearttouch.brotlij.Brotli;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread() {
            @Override
            public void run() {
                decompressFile();
                compresseFile();
            }
        }.start();
    }

    private void decompressFile() {
        String mPatchFilePath = "/sdcard/netease/webcache/com.kaola/webapps/login/1493955460688077_1493882513763.zip.br";
        String decompressedFilePath = mPatchFilePath.substring(0, mPatchFilePath.lastIndexOf("."));
        Brotli.decompressFile(mPatchFilePath, decompressedFilePath);
        File origFile = new File(mPatchFilePath);
//        origFile.delete();
        mPatchFilePath = decompressedFilePath;
    }

    private void compresseFile() {
        String filePath = "/sdcard/netease/webcache/com.kaola/webapps/login/login.zip";
        String compressedFilePath = "/sdcard/netease/webcache/com.kaola/webapps/login/login.zip.br";
        Brotli.compressFile(filePath, compressedFilePath);

        File compressedFile = new File(compressedFilePath);
        if (compressedFile.exists()) {
            Log.i("BrotliDemo", "Compress file successfully!");
        } else {
            Log.i("BrotliDemo", "Compress file failed!");
        }
    }
}
