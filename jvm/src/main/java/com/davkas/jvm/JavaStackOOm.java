package com.davkas.jvm;

/**
 * 创建线程导致内存溢出异常
 * vm: -Xss2M
 * Created by davkas on 16/8/6.
 */
public class JavaStackOOm {
    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaStackOOm oom = new JavaStackOOm();
        oom.stackLeakByThread();
    }
}
