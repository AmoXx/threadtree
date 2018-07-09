package com.xinlizz.demo.factory;

import com.xinlizz.demo.treeviews.JobBranch;
import com.xinlizz.demo.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * job工厂
 */
public class JobFactory {

    private static volatile JobFactory factory;

    public static JobFactory getInstance() {
        if (null == factory) {
            synchronized (JobFactory.class) {
                if (null == factory) {
                    factory = new JobFactory();
                }
            }
        }
        return factory;
    }

    private JobFactory() {

    }

    public Object createJob(JobBranch branch) throws Exception {
        String className = branch.getBusinessClassName();
        if (StringUtils.isBlank(className)) {
            throw new Exception("The business job name is blank!");
        }

        return Class.forName(className).newInstance();
    }
}
