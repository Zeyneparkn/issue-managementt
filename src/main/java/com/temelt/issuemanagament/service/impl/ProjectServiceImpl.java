package com.temelt.issuemanagament.service.impl;

import com.temelt.issuemanagament.dto.ProjectDto;
import com.temelt.issuemanagament.entity.Project;
import com.temelt.issuemanagament.repository.ProjectReposiyory;
import com.temelt.issuemanagament.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectReposiyory projectReposiyory;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectReposiyory projectReposiyory, ModelMapper modelMapper) {
        this.projectReposiyory = projectReposiyory;
        this.modelMapper = modelMapper;
    }

    // Presentation Layer'a exception return edicez.
    @Override
    public Project save(Project project) {
        if(project.getProjectCode()==null){
            throw new IllegalArgumentException("Project code cannot be null");
        }
        return projectReposiyory.save(project);
    }

    @Override
    public ProjectDto getById(Long id) {
        Project project= projectReposiyory.getOne(id);
       return modelMapper.map(project,ProjectDto.class);

    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectReposiyory.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
