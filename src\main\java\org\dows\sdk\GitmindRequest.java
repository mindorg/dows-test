package org.dows.sdk;

import lombok.Data;

import java.util.List;

@Data
public class GitmindRequest {
    private String username;
    private String password;
    private List<GitMindBuildXpath> gitMindBuildXpaths;
}
