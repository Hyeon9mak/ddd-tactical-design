package kitchenpos.eatinordertables.domain;

import java.util.UUID;
import javax.persistence.*;
import kitchenpos.reader.application.EatInOrderCompletedChecker;

@Table(name = "eat_in_order_table")
@Entity
public class EatInOrderTable {

    @Id
    @Column(
        name = "id",
        length = 16,
        unique = true,
        nullable = false
    )
    private UUID id;

    @Embedded
    private EatInOrderTableName name;

    @Embedded
    private NumberOfGuests numberOfGuests;

    @Column(name = "occupied", nullable = false)
    private boolean occupied;

    protected EatInOrderTable() {
    }

    public EatInOrderTable(UUID id, String name) {
        this(id, new EatInOrderTableName(name), new NumberOfGuests(0), false);
    }

    public EatInOrderTable(String name, int numberOfGuests, boolean occupied) {
        this(UUID.randomUUID(), new EatInOrderTableName(name), new NumberOfGuests(numberOfGuests), occupied);
    }

    public EatInOrderTable(UUID id, EatInOrderTableName name, NumberOfGuests numberOfGuests, boolean occupied) {
        this.id = id;
        this.name = name;
        this.numberOfGuests = numberOfGuests;
        this.occupied = occupied;
    }

    public void sit() {
        this.occupied = true;
    }

    public void clear(EatInOrderCompletedChecker checker) {
        if (checker.existsNotCompletedEatInOrder(id)) {
            throw new IllegalStateException("완료되지 않은 주문이 존재해서 테이블을 비울 수 없습니다.");
        }
        this.numberOfGuests = new NumberOfGuests(0);
        this.occupied = false;
    }

    public void changeNumberOfGuests(int numberOfGuests) {
        if (isNotOccupied()) {
            throw new IllegalStateException("착석중이지 않아 손님 수를 변경할 수 없습니다.");
        }

        this.numberOfGuests = new NumberOfGuests(numberOfGuests);
    }

    public UUID getId() {
        return id;
    }

    public String getNameValue() {
        return name.getValue();
    }

    public int getNumberOfGuestsValue() {
        return numberOfGuests.getValue();
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isNotOccupied() {
        return !isOccupied();
    }
}
