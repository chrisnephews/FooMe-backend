package DAO;

import Model.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cknev on 10-1-2018.
 */
@Repository
public interface FriendDAO extends CrudRepository<Friend, Long>{
    Friend findFirstByOrderByIdAsc();
}
