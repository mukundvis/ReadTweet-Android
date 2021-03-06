package com.mukundvis.twitnews.constants;

/**
 * Created by mukundvis on 21/06/15.
 */
public class ApiConstants {

    public static final String HOST_PROD = "http://hackstart.mybluemix.net/";
    public static final String HOST_DEBUG = "http://192.168.1.3:3000/";

    public static final String HOST = HOST_PROD;
    public static final String END_POINT_V2 = HOST + "api/v2";
    public static final String END_POINT_V1 = HOST + "api/v1";

    public static final String URL_LOGIN = "/login";

    public static final String URL_GET_TWEETS = "/tweets";
    public static final String URL_SYNC_TWEETS = "/sync";
    public static final String URL_GET_KEYWORDS = "/keywords";

    public static final String DIFFBOT_ENDPOINT = "http://api.diffbot.com/v3";
    public static final String URL_GET_CLEAN_ARTICLE = "/article";

    public static final String URL_GET_TAXONOMY = "/taxonomy";
}
