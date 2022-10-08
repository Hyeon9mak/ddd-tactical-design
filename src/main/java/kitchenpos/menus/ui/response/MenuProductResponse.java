package kitchenpos.menus.ui.response;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.UUID;
import kitchenpos.menus.domain.MenuProduct;

public class MenuProductResponse {

    private final Long seq;
    private final UUID productId;
    private final long quantity;

    public MenuProductResponse(Long seq, UUID productId, long quantity) {
        this.seq = seq;
        this.productId = productId;
        this.quantity = quantity;
    }

    public static List<MenuProductResponse> of(List<MenuProduct> menuProducts) {
        return menuProducts.stream()
            .map(MenuProductResponse::from)
            .collect(toList());
    }

    public static MenuProductResponse from(MenuProduct menuProduct) {
        return new MenuProductResponse(
            menuProduct.getSeq(),
            menuProduct.getProductId(),
            menuProduct.getQuantityValue()
        );
    }

    public Long getSeq() {
        return seq;
    }

    public UUID getProductId() {
        return productId;
    }

    public long getQuantity() {
        return quantity;
    }
}
