package com.yuntu.basis_learn.thread_learn.hight_level;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestCacheThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // 线程不需要手动指定  来一个任务 如果没有空闲的就再创建一个   如果一个线程空闲时间超过60秒自动销毁
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println(service);
        
        for (int i = 0; i < 2; i++) {
            service.execute(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        
        System.out.println(service);
        
        TimeUnit.SECONDS.sleep(80); //cachedthreadPool里面的线程空闲状态默认60s后销毁，这里保险起见
        
        System.out.println(service);
        
        
    }
}