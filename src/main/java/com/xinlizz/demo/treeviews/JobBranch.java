package com.xinlizz.demo.treeviews;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class JobBranch {

    /** 序号 */
    private Long sort;

    /** 节点名称 */
    private String name;

    /** 业务类名称（全名） */
    private String businessClassName;

    /** 业务类参数 */
    private Object[] params = {};

    /** 分支类型 */
    private String type;

    /** 分支子节点 */
    private List<JobBranch> children;

    /** 运行类型 */
    private String runType;

    public JobBranch() {
    }

    public JobBranch(Long sort, String businessClassName, Object[] params, String type, List<JobBranch> children, String runType) {
        this.sort = sort;
        this.businessClassName = businessClassName;
        this.params = params;
        this.type = type;
        this.children = children;
        this.runType = runType;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessClassName() {
        return businessClassName;
    }

    public void setBusinessClassName(String businessClassName) {
        this.businessClassName = businessClassName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<JobBranch> getChildren() {
        return children;
    }

    public void setChildren(List<JobBranch> children) {
        this.children = children;
    }

    public String getRunType() {
        return runType;
    }

    public void setRunType(String runType) {
        this.runType = runType;
    }

    @Override
    public String toString() {
        return "JobBranch{" +
                "sort=" + sort +
                ", businessClassName='" + businessClassName + '\'' +
                ", params=" + Arrays.toString(params) +
                ", type='" + type + '\'' +
                ", children=" + children +
                ", runType='" + runType + '\'' +
                '}';
    }
}
