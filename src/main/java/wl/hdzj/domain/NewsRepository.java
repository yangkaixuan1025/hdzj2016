package wl.hdzj.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wl.hdzj.entity.News;

@Repository
public interface NewsRepository extends CrudRepository<News, Integer> {
}
