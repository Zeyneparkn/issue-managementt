package com.temelt.issuemanagament.service;

import com.temelt.issuemanagament.dto.IssueDto;
import com.temelt.issuemanagament.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService  {

    //Save işlemi yapılırken entity katmanındaki Issue nesnemi vermek yerine dto da oluşturduğum IssueDto nesnemi verdim. Service entity katmanıma ulaşamasın.
    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);  //Page<IssueDto> getAllPageable(Pageable pageable);  bu şekildeydi fakat fronta PAge ile değil TPage ile dönücem

    Boolean delete(IssueDto issue);



}
