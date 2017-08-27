package com.bridge.jcvd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Create By Bridge On 2017/8/27
 *
 * Des: Android视频播放器插件的学习与应用
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button mTinyWindow, mAutoTinyWindow, mAboutListView, mPlayDirectly, mAboutApi, mAboutWebView,play_music;
    JCVideoPlayerStandard jcVideoPlayerStandard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        play();
    }

    /**
     * 播放器的相关配置
     * 注意：视频播放需要联网，故需要在AndroidManifest.xml配置文件中加入网络请求权限
     */
    private void play() {
        //play_music.setOnClickListener(this);
        //配置url，视频地址，缩略图地址，标题等
        jcVideoPlayerStandard.setUp("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4",
                JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL,"天黑请闭眼");
        //jcVideoPlayerStandard.thumbImageView.setImage("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640");

    }

    /**
     * 初始化组件
     */
    private void init() {

        jcVideoPlayerStandard = (JCVideoPlayerStandard) findViewById(R.id.jc_video);
        mTinyWindow = (Button) findViewById(R.id.tiny_window);
        mAutoTinyWindow = (Button) findViewById(R.id.auto_tiny_window);
        mPlayDirectly = (Button) findViewById(R.id.play_directly_without_layout);
        mAboutListView = (Button) findViewById(R.id.about_listview);
        mAboutApi = (Button) findViewById(R.id.about_api);
        //play_music = (Button) findViewById(R.id.play_music);
        mAboutWebView = (Button) findViewById(R.id.about_webview);

        mTinyWindow.setOnClickListener(this);
        mAutoTinyWindow.setOnClickListener(this);
        mAboutListView.setOnClickListener(this);
        mPlayDirectly.setOnClickListener(this);
        mAboutApi.setOnClickListener(this);
        mAboutWebView.setOnClickListener(this);

    }


    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()){
            return;
        }
        super.onBackPressed();

    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

    @Override
    public void onClick(View view) {

    }
}
