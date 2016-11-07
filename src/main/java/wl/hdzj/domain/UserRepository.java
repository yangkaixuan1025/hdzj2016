package wl.hdzj.domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wl.hdzj.entity.User;

import java.util.List;

@Repository()
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findTop1ByAccount(String account);
}
