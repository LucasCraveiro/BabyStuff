package com.example.lucascraveiro.babystuff;

/**
 * Created by lucascraveiro on 2018-03-12.
 */

public interface PlayerAdapter {
    void loadMedia(int resourceId);

    void release();

    boolean isPlaying();

    void play();

    void reset();

    void pause();

    void initializeProgressCallback();

    void seekTo(int position);
}
