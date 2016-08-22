package com.example.ramsraga.salesbox.application;



        import android.app.ActivityManager;
        import android.content.Context;

        import com.android.volley.Request;
        import com.android.volley.RequestQueue;
        import com.android.volley.toolbox.ImageLoader;
        import com.android.volley.toolbox.Volley;
        import com.example.ramsraga.salesbox.helpers.BitmapLruCache;

/**
 * Helper class that is used to provide references to initialized RequestQueue(s) and ImageLoader(s)
 *
 * @author Ognyan Bankov
 *
 */

public class MyVolley {
    private static RequestQueue mRequestQueue;
    private static ImageLoader mImageLoader;


    private MyVolley() {
        // no instances
    }


    static void init(Context context) {
        mRequestQueue = Volley.newRequestQueue(context);

        int memClass = ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE))
                .getMemoryClass();
        // Use 1/8th of the available memory for this memory cache.
        int cacheSize = 1024 * 1024 * memClass / 8;
        mImageLoader = new ImageLoader(mRequestQueue, new BitmapLruCache(cacheSize));
    }


    public static RequestQueue getRequestQueue() {
        //if (mRequestQueue != null) {
        return mRequestQueue;
        /*} else {
            throw new IllegalStateException("RequestQueue not initialized");
        }*/
    }
    public static ImageLoader getImageLoader() {
        if (mImageLoader != null) {
            return mImageLoader;
        } else {
            throw new IllegalStateException("ImageLoader not initialized");
        }
    }

    public static <T> void addToRequestQueue(Request<T> req) {
        req.setTag("");
        getRequestQueue().add(req);
    }
}

