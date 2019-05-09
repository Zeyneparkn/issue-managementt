package com.temelt.issuemanagament.service.impl;

import com.temelt.issuemanagament.dto.IssueDto;
import com.temelt.issuemanagament.entity.Issue;
import com.temelt.issuemanagament.repository.IssueRepository;
import com.temelt.issuemanagament.service.IssueService;
import com.temelt.issuemanagament.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    //alt enter ile interface metodlarını impl. ettim

    //save işlemi entity'nin repository'si üzerinden gerçekleştirir.
    /*
    @Autowired
    private IssueRepository issueRepository;  //setter injecttion. Daha iyi bir yöntem olarak constructer injection vardır. onu kullanalım.
    */

    private final IssueRepository issueRepository;  //nesneye finel etiketini verdiğin zaman o nesnenin runtime da değişmesini engellemiş oluyorsun. Daha sonradan bu nesneye atama yapılması engellemiş olunuyor.

    private  final ModelMapper modelMapper;  //ModelMapper'ı constructer imjectin ile dahil ettik.

    @Autowired  //Yazmasan da inject edileceğini biliyor.
    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if(issue.getDate()==null){
            throw new IllegalArgumentException("issue Date can not be null");
        }
        return null;
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {

       Page<Issue> data= issueRepository.findAll(pageable);
       TPage page= new TPage<IssueDto>();
       IssueDto[] dtos= modelMapper.map(data.getContent(),IssueDto[].class);
       page.setStat(data, Arrays.asList(dtos));
       return page;

    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
