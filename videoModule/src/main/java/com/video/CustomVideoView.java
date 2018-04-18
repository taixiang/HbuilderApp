package com.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

/**
 * Created by tx on 2018/4/9.
 */

public class CustomVideoView extends StandardGSYVideoPlayer {
    public CustomVideoView(Context context, Boolean fullFlag) {
        super(context, fullFlag);
        GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_DEFAULT);

        init();
    }

    public CustomVideoView(Context context) {
        super(context);
        GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_DEFAULT);

        init();
    }

    public CustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_DEFAULT);

        init();
    }

    private void init() {
        mStartButton.setVisibility(View.GONE);
        mLockScreen.setVisibility(View.GONE);
        mLoadingProgressBar.setVisibility(View.GONE);
        mProgressBar.setVisibility(View.GONE);
        mBackButton.setVisibility(View.GONE);
        mTopContainer.setVisibility(View.GONE);
        mBottomContainer.setVisibility(View.GONE);
        mBottomProgressBar.setVisibility(View.GONE);
        mLoadingProgressBar.setVisibility(View.GONE);

//        mDialogSeekTime.setVisibility(GONE);
//        mDialogTotalTime.setVisibility(GONE);
    }

    @Override
    protected void showProgressDialog(float deltaX, String seekTime, int seekTimePosition, String totalTime, int totalTimeDuration) {
        super.showProgressDialog(deltaX, seekTime, seekTimePosition, totalTime, totalTimeDuration);
        mDialogSeekTime.setVisibility(View.GONE);
        mDialogTotalTime.setVisibility(View.GONE);
        mDialogIcon.setVisibility(View.GONE);
        mDialogProgressBar.setVisibility(View.GONE);
        init();
    }

    @Override
    protected void onClickUiToggle() {
        super.onClickUiToggle();
        init();
    }

    @Override
    protected void updateStartImage() {
        super.updateStartImage();
        init();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        super.onProgressChanged(seekBar, progress, fromUser);
//        mBottomContainer.setVisibility(GONE);
        mBottomProgressBar.setVisibility(View.GONE);
    }


    @Override
    protected void hideAllWidget() {
        super.hideAllWidget();
        mBottomProgressBar.setVisibility(View.GONE);
    }

    @Override
    protected void changeUiToPreparingShow() {
        super.changeUiToPreparingShow();
        mLoadingProgressBar.setVisibility(View.GONE);
        setViewShowState(mTopContainer, View.GONE);
        setViewShowState(mBottomContainer, View.GONE);
    }

    @Override
    protected void changeUiToPlayingBufferingShow() {
        super.changeUiToPlayingBufferingShow();
        mLoadingProgressBar.setVisibility(View.GONE);
        setViewShowState(mTopContainer, View.GONE);
        setViewShowState(mBottomContainer, View.GONE);
    }
}
