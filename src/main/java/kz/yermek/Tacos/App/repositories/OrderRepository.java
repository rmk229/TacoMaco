package kz.yermek.Tacos.App.repositories;

import kz.yermek.Tacos.App.models.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
