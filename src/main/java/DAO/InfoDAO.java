package DAO;

import Model.CPUTemp;
import org.springframework.data.repository.CrudRepository;

public interface InfoDAO extends CrudRepository<CPUTemp, Long> {
}
