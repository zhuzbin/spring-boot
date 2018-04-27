package com.zhuzb.springboot.repository;

import com.zhuzb.springboot.entity.Person;
import com.zhuzb.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/27
 * Time：17:37
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Person> findById(String id);
}
