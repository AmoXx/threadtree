package com.xinlizz.demo.enums;

public enum BranchTypeEnum {

    BRANCH_ROOT("root", "根节点"), BRANCH_BRANCH("branch", "支节点"), BRANCH_NODE("node", "业务处理节点");

    private String type;

    private String desc;

    BranchTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
