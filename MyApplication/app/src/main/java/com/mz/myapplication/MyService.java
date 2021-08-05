package com.mz.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    MyBinder myBinder;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        myBinder = new MyBinder();
        return  myBinder;
    }

    class MyBinder extends IMyAidlInterface.Stub{

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String getName() throws RemoteException {
            return "8888888";
        }
    }
}
