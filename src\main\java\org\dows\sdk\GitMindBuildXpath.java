package org.dows.sdk;

import lombok.Data;

import java.util.List;

@Data
public class GitMindBuildXpath {
    private String mindFileName;
    private List<String> databaseXpath;
    private List<String> apiXpath;
}