package com.hussam.fproject.hsrw.myapplication.network;


public interface HttpCall<T> {

    void cancel();

    void enqueue(HttpCallback<T> callback);

    HttpCall<T> cloneCall();
}
