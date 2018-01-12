package DAO;

import Model.Acceleration;
import Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by cknev on 10-1-2018.
 */
@Repository
public interface AccelerationDAO extends CrudRepository<Acceleration, Integer>{
    Acceleration findFirstByOrderByIdDesc(); //Find the last row
}
