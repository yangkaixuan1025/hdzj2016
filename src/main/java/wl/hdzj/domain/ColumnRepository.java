package wl.hdzj.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wl.hdzj.entity.Column;

/**
 * Created by micro on 2016/11/7.
 */
@Repository
public interface ColumnRepository extends CrudRepository<Column, Integer> {

}
