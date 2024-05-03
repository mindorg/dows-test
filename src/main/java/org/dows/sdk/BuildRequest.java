package org.dows.sdk;

import lombok.Data;

import java.util.List;

@Data
public class BuildRequest {

    private String projectAuthor;
    private String projectName;
    private String groupId;
    private String artifactId;
    private String basePackage;
    private String version;

    // todo move GitmindRequest
    private String gitmind;
    private List<String> databaseXpath;
    private List<String> apiXpath;

    private GitmindRequest gitmindRequest;








}