package DAO;

import Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cknev on 10-1-2018.
 */
@Repository
public interface UserDAO extends CrudRepository<User, Long>{

}
