
package org.java.interviewLive.capegimini;

public class SingletonDmeo {

}

class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    };

    public static SingletonLazy getInstance() {
        if (instance == null) {
            return instance = new SingletonLazy();
        }
        return instance;
    }

}

class SingletonLazywithThreadSafe {

    private static SingletonLazywithThreadSafe INSTANCE;

    private SingletonLazywithThreadSafe(){};

    public static synchronized SingletonLazywithThreadSafe getInstance(){
        if(INSTANCE == null){
            return INSTANCE = new SingletonLazywithThreadSafe();
        }
        return INSTANCE;
    }
}

class SingletonEager {
    private static SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager(){};

    public static SingletonEager getInstance(){
        return INSTANCE;
    }
}