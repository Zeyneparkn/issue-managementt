package com.temelt.issuemanagament.repository;

import com.temelt.issuemanagament.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

//Repository'leri singleton instance olarak kullanıcaz o yüzden @Repository annotatio'nını koyuyoruz
//Project rep.'nin bir tane instance'ı spring'in IOC containewr'ı içerisine konulacak. Oradan autowired edilmesi istenen yerlere imject edilecek.
//Ama artık JpaReposiyory bunu koymamıza gerek kalmadan bunu yapıyor.
@Repository
public interface ProjectReposiyory extends JpaRepository<Project,Long> {

    //JpaRepository'nin metodları dışlında metod yazmak istersem buratya yazabilirim.
    //SpringBoot'un özelliği olan find metoduyla belirli metodları yazabilirsin o kendi anlıyor.

  //List<Project>  findAllByProjectCode(String projectCode);
    //List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);

    //parametre olarak gönderdiğim projekodu olan  ve adı parametrede gönderilen değer olan projeleri getir.
   // List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode, String name);


    List<Project> getAllByProjectCode(String projectCode);

    List<Project> getAllByProjectCodeContains(String projectCode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);



}
