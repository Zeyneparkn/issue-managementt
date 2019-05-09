package com.temelt.issuemanagament.dto;

import com.temelt.issuemanagament.entity.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

    private Long id;
    private String projectName;
    private String progectCode;


}
