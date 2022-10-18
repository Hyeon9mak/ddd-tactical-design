package kitchenpos.eatinordertables.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import kitchenpos.eatinordertables.domain.EatInOrderTableName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EatInOrderTableNameTest {

    @DisplayName("주문 테이블 이름은 Null 일 수 없다.")
    @Test
    void nullException() {
        assertThatThrownBy(() -> new EatInOrderTableName(null))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("올바르지 않은 주문 테이블 이름입니다.");
    }

    @DisplayName("주문 테이블의 이름은 공백으로 이루어질 수 없다.")
    @ValueSource(strings = {" ", "  ", "           "})
    @ParameterizedTest
    void blankException(String blank) {
        assertThatThrownBy(() -> new EatInOrderTableName(blank))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("주문 테이블 이름은 공백일 수 없습니다.");
    }
}
