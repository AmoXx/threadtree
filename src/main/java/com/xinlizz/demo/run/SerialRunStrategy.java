package com.xinlizz.demo.run;

import com.xinlizz.demo.job.AbstractJob;

/**
 * 串行运行策略
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class SerialRunStrategy implements Run {

    public void runMethod(AbstractJob job, Object[] params, String jobName) {
        job.doBusiness(params);
    }
}
