package com.song.sunset.activitys;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dou361.ijkplayer.listener.OnShowThumbnailListener;
import com.dou361.ijkplayer.widget.PlayStateParams;
import com.dou361.ijkplayer.widget.PlayerView;
import com.song.sunset.R;
import com.song.sunset.utils.ScreenUtils;

/**
 * Created by Song on 2016/9/1 0001.
 * Email:z53520@qq.com
 */
public class TVActivity extends AppCompatActivity {
    public static final String TV_URL = "tv_url";
    public static final String TV_NAME = "tv_name";
    private String tvUrl;
    private String tvName;

    private PlayerView player;

//    private JCVideoPlayerStandard jc;
//    JCVideoPlayer.JCAutoFullscreenListener sensorEventListener;
//    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().from(this).inflate(R.layout.simple_player_view_player, null);
        setContentView(rootView);
        if (getIntent() != null) {
            tvName = getIntent().getStringExtra(TV_NAME);
            tvUrl = getIntent().getStringExtra(TV_URL);
        }
//        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
//        sensorEventListener = new JCVideoPlayer.JCAutoFullscreenListener();
//        jc = (JCVideoPlayerStandard) findViewById(R.id.id_tv_jc_player);
//        jc.setUp(tvUrl, JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, tvName);

        player = new PlayerView(this, rootView)
                .setTitle(tvName)
                .setScaleType(PlayStateParams.fitparent)
                .hideMenu(true)
                .forbidTouch(false)
                .showThumbnail(new OnShowThumbnailListener() {
                    @Override
                    public void onShowThumbnail(ImageView ivThumbnail) {
                        Glide.with(TVActivity.this)
                                .load("http://4493bz.1985t.com/uploads/allimg/141204/4-141204095J8.jpg")
                                .into(ivThumbnail);
                    }
                })
                .setPlaySource(tvUrl)
                .startPlay();

        Log.d("TV", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TV", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TV", "onResume");
//        Sensor accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
//        sensorManager.registerListener(sensorEventListener, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);

        if (player != null) {
            player.onResume();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //屏幕旋转隐藏或显示状态栏
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {//横屏
            ScreenUtils.fullscreen(this, true);
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {//竖屏
            ScreenUtils.fullscreen(this, false);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
//        sensorManager.unregisterListener(sensorEventListener);
//        JCVideoPlayer.releaseAllVideos();
        Log.d("TV", "onPause");
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TV", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TV", "onDestroy");
        if (player != null) {
            player.onDestroy();
        }
    }

    @Override
    public void onBackPressed() {
//        if (JCVideoPlayer.backPress()) {
//            return;
//        }

        if (player != null && player.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    public static void start(Context context, String tvUrl, String tvName) {
        Intent intent = new Intent(context, TVActivity.class);
        intent.putExtra(TV_NAME, tvName);
        intent.putExtra(TV_URL, tvUrl);
        context.startActivity(intent);
    }
}
