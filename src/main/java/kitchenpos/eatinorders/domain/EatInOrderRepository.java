package kitchenpos.eatinorders.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EatInOrderRepository {
    EatInOrder save(EatInOrder eatInOrder);

    Optional<EatInOrder> findById(UUID id);

    List<EatInOrder> findAll();

    boolean existsByEatInOrderTableAndStatusNot(EatInOrderTable eatInOrderTable, EatInOrderStatus status);

    boolean existsNotByEatInOrderTableAndStatusNot(EatInOrderTable eatInOrderTable, EatInOrderStatus status);
}
