package kitchenpos.products.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import kitchenpos.profanity.infra.FakeProfanityCheckClient;
import kitchenpos.profanity.infra.ProfanityCheckClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ProductNameTest {

    private ProfanityCheckClient profanityCheckClient;

    @BeforeEach
    void setUp() {
        profanityCheckClient = new FakeProfanityCheckClient();
    }

    @DisplayName("상품 이름은 Null 일 수 없다.")
    @Test
    void nullException() {
        assertThatThrownBy(() -> new ProductName(null, profanityCheckClient))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("올바르지 않은 상품 이름입니다.");
    }

    @DisplayName("상품의 이름은 공백으로 이루어질 수 없다.")
    @ValueSource(strings = {" ", "  ", "           "})
    @ParameterizedTest
    void blankException(String blank) {
        assertThatThrownBy(() -> new ProductName(blank, profanityCheckClient))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("상품 이름은 공백일 수 없습니다.");
    }

    @DisplayName("상품의 이름은 비속어를 포함할 수 없다.")
    @ValueSource(strings = {"비속어", "욕설"})
    @ParameterizedTest
    void profanityException(String profanity) {
        assertThatThrownBy(() -> new ProductName(profanity, profanityCheckClient))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("상품 이름에는 비속어가 포함될 수 없습니다.");
    }
}
