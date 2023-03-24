package io.github.andrijat98.tacocloud.repos;

import io.github.andrijat98.tacocloud.domains.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
