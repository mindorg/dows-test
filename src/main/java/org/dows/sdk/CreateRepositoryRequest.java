package org.dows.sdk;

import lombok.Data;

@Data
public class CreateRepositoryRequest {
    /**
     * gitLab-账号
     */
    private String userName;
    /**
     * 项目Id
     */
    private Long projectId;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目介绍
     */
    private String projectDescribe;
    /**
     * 项目是否开源
     */
    private String visibility;
}
