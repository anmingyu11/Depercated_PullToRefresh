package com.amy.inertia.interfaces;

import android.view.View;

public interface IHeaderView {

    View getView();

    /**
     *
     * @param fraction
     * @param maxHeadHeight
     * @param headHeight
     */
    void onPullingDown(float fraction, float maxHeadHeight, float headHeight);

    /**
     *
     * @param fraction
     * @param maxHeadHeight
     * @param headHeight
     */
    void onPullReleasing(float fraction, float maxHeadHeight, float headHeight);

    /**
     *
     * @param maxHeadHeight
     * @param headHeight
     */
    void startAnim(float maxHeadHeight, float headHeight);

    /**
     *
     */
    void onFinish();
}