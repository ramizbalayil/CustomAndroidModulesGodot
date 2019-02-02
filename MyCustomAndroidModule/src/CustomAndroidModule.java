package org.godotengine.godot;

import com.godot.game.R;
import android.app.Activity;

public class CustomAndroidModule extends Godot.SingletonBase { // class name should be same as java file name...duh

    public int myFirstFunction(int a, int b) {
       return a + b; // should return integer
    }

    static public Godot.SingletonBase initialize(Activity p_activity) {
        return new CustomAndroidModule(p_activity);
    }

    public CustomAndroidModule(Activity p_activity) {
        //register class name and functions to bind
        registerClass("CustomAndroidModule", new String[]{"myFirstFunction"});
    }


    // Not needed for our purposes
    
    // forwarded callbacks you can reimplement, as SDKs often need them
    // protected void onMainActivityResult(int requestCode, int resultCode, Intent data) {}
    //
    // protected void onMainPause() {}
    // protected void onMainResume() {}
    // protected void onMainDestroy() {}
    //
    // protected void onGLDrawFrame(GL10 gl) {}
    // protected void onGLSurfaceChanged(GL10 gl, int width, int height) {} // singletons will always miss first onGLSurfaceChanged call

}
