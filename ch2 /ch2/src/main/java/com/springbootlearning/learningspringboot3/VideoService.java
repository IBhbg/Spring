package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;

@Service
public class VideoService {
    private List<Video> videos = List.of(
            new Video("Need HELP with your SPRING BOOT 3"),
            new Video("Don't do THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!"));

    public List<Video> getVideos(){
        return videos;
    }


    public void create(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo.toString());
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
