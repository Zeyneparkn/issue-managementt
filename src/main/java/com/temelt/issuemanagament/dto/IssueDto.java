package com.temelt.issuemanagament.dto;

import com.temelt.issuemanagament.entity.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

//Rest Apilerimiz dış dünyayla dtolar üzerinden konuşacak. Bir nevi rest nesnelerimiz.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueDto {

    private Long id;
    private String  description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public Date getDate() {
        return date;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public UserDto getAssignee() {
        return assignee;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIssueStatus(IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }

    public void setAssignee(UserDto assignee) {
        this.assignee = assignee;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }
}
