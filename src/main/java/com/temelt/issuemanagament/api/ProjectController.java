package com.temelt.issuemanagament.api;

import com.temelt.issuemanagament.dto.ProjectDto;
import com.temelt.issuemanagament.service.impl.ProjectServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

  private final ProjectServiceImpl projectServiceImpl;
  private final ModelMapper modelMapper;

  public ProjectController(ProjectServiceImpl projectServiceImpl, ModelMapper modelMapper) {
    this.projectServiceImpl = projectServiceImpl;
    this.modelMapper = modelMapper;
  }

  @GetMapping("/{id}")
  public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id){
    ProjectDto projectDto=projectServiceImpl.getById(1L);
    return ResponseEntity.ok(projectDto);
  }
}
