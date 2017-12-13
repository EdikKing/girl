package cn.edik.repository;

import cn.edik.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by edik on 2017/12/12.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    // 通过年龄查询
    public List<Girl> findByAge(Integer age);
}
