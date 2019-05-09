package com.temelt.issuemanagament.service;


import com.temelt.issuemanagament.dto.ProjectDto;
import com.temelt.issuemanagament.entity.Project;
import com.temelt.issuemanagament.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    ProjectDto getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);




}
