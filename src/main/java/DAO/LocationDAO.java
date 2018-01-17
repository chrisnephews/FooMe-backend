package DAO;

import Model.Friend;
import Model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cknev on 10-1-2018.
 */
@Repository
public interface LocationDAO extends CrudRepository<Location, Long>{

}
