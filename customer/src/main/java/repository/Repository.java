package repository;

import org.springframework.data.repository.CrudRepository;
import model.Model;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Model, Integer> {
}
