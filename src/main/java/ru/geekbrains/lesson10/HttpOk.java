package ru.geekbrains.lesson10;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpOk {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println("Status code: " + response.code() + " " + response.message());
        System.out.println("ContentType: " + response.body().contentType());
        System.out.println("Body: " + response.body().string());
    }
}
