# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- [x] 상품을 등록할 수 있다.
- [x] 상품의 가격이 올바르지 않으면 등록할 수 없다.
  - [x] 상품의 가격은 0원 이상이어야 한다.
- [x] 상품의 이름이 올바르지 않으면 등록할 수 없다.
  - [x] 상품의 이름에는 비속어가 포함될 수 없다.
- [x] 상품의 가격을 변경할 수 있다.
- [x] 상품의 가격이 올바르지 않으면 변경할 수 없다.
  - [x] 상품의 가격은 0원 이상이어야 한다.
- [x] 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- [x] 상품의 목록을 조회할 수 있다.

### 메뉴
- [x] 메뉴 그룹을 등록할 수 있다.
- [x] 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
  - [x] 메뉴 그룹의 이름은 비워 둘 수 없다.
- [ ] 메뉴 그룹의 목록을 조회할 수 있다.
- [ ] 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- [ ] 상품이 없으면 등록할 수 없다.
- [x] 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- [x] 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
  - [x] 메뉴의 가격은 0원 이상이어야 한다.
- [ ] 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- [x] 메뉴는 특정 메뉴 그룹에 속해야 한다.
- [x] 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
  - [x] 메뉴의 이름에는 비속어가 포함될 수 없다.
- [ ] 메뉴의 가격을 변경할 수 있다.
- [ ] 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
  - [ ] 메뉴의 가격은 0원 이상이어야 한다.
- [ ] 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- [ ] 메뉴를 노출할 수 있다.
- [ ] 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- [ ] 메뉴를 숨길 수 있다.
- [ ] 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
  - 주문 테이블의 이름은 비워 둘 수 없다.
- 착석여부를 참으로 설정할 수 있다.
- 착석여부를 거짓으로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 정리 할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
  - 방문한 손님 수는 0 이상이어야 한다.
- 착석여부가 거짓인 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 매장 주문

- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 착석여부가 거짓인 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 완료한다.
- 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 착석여부를 거짓으로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 착석여부를 거짓으로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

### 배달 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
  - 배달 주소는 비워 둘 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 완료된 주문만 완료할 수 있다.
- 서빙된 주문만 완료할 수 있다.
- 주문 목록을 조회할 수 있다.

### 포장 주문

- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 주문 항목의 수량은 0 이상이어야 한다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 완료한다.
- 서빙된 주문만 완료할 수 있다.
- 주문 목록을 조회할 수 있다.

<br>

## 용어 사전

### 페어 시간 동안 고민한 '개발자만 읽는 용어사전 vs 기획자도 읽는 용어사전'

1. 용어 사전을 읽는 사람은 누구일까? 개발자? 기획자?
  - 대상 독자가 정해지지 않으면, 나머지 내용도 불분명해진다.
2. 어차피 코드로 보고 흐름을 읽을 수 있기 때문에, 특정 키워드만 잘 잡아주면 될 것 같다.
3. 도메인 별로 용어사전 표가 나뉘면 좋겠다.
4. 도메인끼리 중복되는 용어가 있어도 놔두기. 정책이 어떻게 변할지 모름
5. 메뉴상품(menu_product)와 같은 용어를 별도로 분리한 이유
  - 기획자나 마케팅 팀 등도 얼마든지 쿼리를 작성해서 원하는 데이터를 조회하는 시대
  - 비록 기능상으로는 의미가 없는 연관관계 테이블이지만, 용어를 정리해줄 필요는 있는 것 같다.

### 상품

| 한글명  | 영문명                  | 설명                                  |
|------|----------------------|-------------------------------------|
| 상품   | product              | 메뉴에 대한 이름과 가격 메타정보. (햄버거, 감자튀김 등)   |
| -    | id                   | 상품에 대한 고유한 식별번호.                    |
| 이름   | product name         | 상품의 이름. 공백이 아니어야 한다. 비속어를 포함할 수 없다. |
| 가격   | product price        | 상품의 가격. 0원 이상이어야 한다.                |
| 가격변경 | change product price | 상품의 가격을 변경한다. 변경할 가격은 0원 이상이어야 한다.  |

### 메뉴그룹

| 한글명  | 영문명             | 설명                               |
|------|-----------------|----------------------------------|
| 메뉴그룹 | menu group      | 메뉴가 속하는 그룹. (세트메뉴 그룹, 단품메뉴 그룹 등) |
| -    | id              | 메뉴 그룹에 대한 고유한 식별번호.              |
| 이름   | menu group name | 메뉴그룹의 이름. 공백이 아니어야 한다.           |

### 메뉴

| 한글명  | 영문명               | 설명                                                             |
|------|-------------------|----------------------------------------------------------------|
| 메뉴   | menu              | 손님에게 판매되기 위해 전시되는 정보. 1개 이상의 메뉴상품으로 이루어진다. (감자튀김 단품, 치즈버거 세트)  |
| -    | id                | 메뉴에 대한 고유한 식별번호.                                               |
| 이름   | menu name         | 메뉴의 이름. 공백이 아니어야 한다. 비속어를 포함할 수 없다.                            |
| 가격   | menu price        | 메뉴의 가격. 0원 이상이어야 한다. 메뉴에 속한 상품 금액의 합보다 작거나 같아야한다.              |
| 가격변경 | change menu price | 메뉴의 가격을 변경한다. 변경할 가격은 0원 이상이어야하고, 메뉴에 속한 상품 금액의 합보다 작거나 같아야한다. |
| 전시   | display           | 메뉴를 노출한다. 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 비전시한다.           |
| 비전시  | hide              | 메뉴를 숨긴다.                                                       |

### 메뉴상품

| 한글명             | 영문명          | 설명                           |
|-----------------|--------------|------------------------------|
| 메뉴상품            | menu product | 메뉴에 포함되는 상품 관련 추가정보          |
| -               | id           | 양의 정수로 이루어진 고유한 식별번호.        |
| 수량              | quantity     | 메뉴에 속한 상품의 수량                |
| 메뉴에 속한 상품 금액의 합 | total price  | 메뉴에 속한 (상품의 금액 * 상품의 수량)들의 합 |

### 주문테이블

| 한글명     | 영문명                     | 설명                                                                     |
|---------|-------------------------|------------------------------------------------------------------------|
| 주문테이블   | eat in order table      | 매장 주문시 사용되는 매장 내 테이블                                                   |
| -       | id                      | 주문테이블에 대한 고유한 식별번호.                                                    |
| 이름      | eat in order table name | 주문테이블의 이름. 공백이 아니어야 한다.                                                |
| 손님      | guest                   | 매장을 이용하는 사람                                                            |
| 손님 수    | number of guests        | 매장을 이용하는 사람 수. 손님 수는 0 이상이어야 한다.                                       |
| 손님 수 변경 | change number of guests | 손님 수를 변경한다. 변경할 손님 수는 0 이상이어야 한다.                                      |
| 착석여부    | occupied                | 주문테이블에 손님이 있는지 없는지 여부를 나타낸다. 착석여부가 거짓인 테이블에는 매장 주문을 등록할 수 없다.          |
| 정리      | clear                   | 주문테이블을 정리한다. 착석여부가 거짓이 된다. 완료되지 않은 주문이 있는 주문 테이블은 착석여부를 거짓으로 설정할 수 없다. |
| 착석      | sit                     | 주문테이블에 손님을 착석시킨다. 착석여부가 참이 된다.                                         |

### 주문

| 한글명    | 영문명               | 설명                                                                                                     |
|--------|-------------------|--------------------------------------------------------------------------------------------------------|
| 주문     | order             | 손님이 메뉴를 구매하는 일련의 과정                                                                                    |
| -      | id                | 주문에 대한 고유한 식별번호.                                                                                       |
| 배달     | delivery          | 주문유형 중 하나. 배달을 통한 상품 전달 받음을 의미한다.                                                                      |
| 포장     | takeout           | 주문유형 중 하나. 매장을 이용하지 않고 직접 찾아와 주문한 상품만 가져감을 의미한다.                                                       |
| 매장     | eat in            | 주문유형 중 하나. 매장 내 주문테이블을 이용한 식사를 의미한다.                                                                   |
| 주문상태   | order status      | 시간이 경과함에 따라 변화하는 주문의 진행 상태. 대기중, 접수됨, 서빙됨, 배달중, 배달됨, 완료 6가지가 존재한다.                                     |
| 대기중    | waiting           | 주문상태 중 하나. 손님이 주문을 넣었으나 아직 접수하지 않은 상태다.                                                                |
| 접수됨    | accepted          | 주문상태 중 하나. 대기중인 주문을 접수한 상태다.                                                                           |
| 서빙됨    | served            | 주문상태 중 하나. 완성된 상품을 손님이나 배달기사에게 전달한 상태다.                                                                |
| 배달중    | delivering        | 주문상태 중 하나. 배달기사가 손님에게 상품을 배달하는 중이다.                                                                    |
| 배달됨    | delivered         | 주문상태 중 하나. 배달기사가 손님에게 상품을 배달 완료한 상태다.                                                                  |
| 완료     | completed         | 주문상태 중 하나. 주문에 대한 모든 처리가 완료됨을 뜻한다.                                                                     |
| 주문시각   | order date time   | 주문이 최초로 생성된 시각을 뜻한다.                                                                                   |
| 배달주소   | delivery address  | 배달 주문시 배달이 되어야 하는 주소를 뜻한다. 배달 주문의 경우 배달주소가 꼭 존재해야 한다.                                                  |
| 배달기사   | kitchen rider     | 손님에게 상품을 배달해주는 기사를 뜻한다.                                                                                |
| 접수     | accept            | 대기중인 주문을 접수한다. 그 외의 주문은 접수할 수 없다. 배달주문의 경우 배달기사에게 배달요청을 보내둔다.                                          |
| 서빙     | serve             | 완성된 상품을 전달한다. 기존 주문상태가 접수됨이 아닐 경우 전달할 수 없다.                                                            |
| 배달시작설정 | start delivery    | 배달이 시작됨을 기록한다. 기존 주문상태가 서빙됨이 아니거나, 배달 주문이 아닐 경우 배달을 시작할 수 없다.                                          |
| 배달완료설정 | complete delivery | 배달이 완료됨을 기록한다. 기존 주문상태가 배달중이 아닐 경우 배달을 완료할 수 없다.                                                       |
| 완료     | complete          | 주문을 완료처리한다. 배달 주문은 배달됨 상태여야하고, 포장이나 매장 주문은 서빙됨 상태여야한다. 매장 주문의 경우 주문 테이블의 손님수를 0으로 바꾸고 착석여부를 거짓으로 설정한다. |

### 주문항목

| 한글명  | 영문명                   | 설명                                                                                    |
|------|-----------------------|---------------------------------------------------------------------------------------|
| 주문항목 | order line item       | 주문에 속한 메뉴의 수량과 가격 메타정보. (햄버거 5개, 15,000원)                                             |
| -    | seq                   | 양의 정수로 이루어진 고유한 식별번호.                                                                 |
| 수량   | quantity              | 주문에 속한 메뉴의 개수. 매장 주문은 주문 항목의 수량이 0 미만일 수 있다. 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다. |
| 가격   | order line item price | 주문에 속한 메뉴의 가격과 수량을 곱한 값. 0 이상이어야 한다.                                                  |

### 공통
| 한글명 | 영문명       | 설명              |
|-----|-----------|-----------------|
| 비속어 | profanity | 음란한 표현, 욕설, 패담. |

<br>

## 모델링

### 상품
- [x] `Product`는 고유식별자와 `ProductName`과 `ProductPrice`를 갖는다.
  - [x] `ProductName`에는 `Profanity`가 포함될 수 없다.
  - [x] `ProductPrice`는 0 이상이어야 한다.
- [x] `ProductPrice`를 변경할 수 있다.
  - [x] 기존 `Product`가 존재하지 않을 경우 `ProductPrice`를 변경할 수 없다.
  - [x] 변경하려는 `ProductPrice`는 0 이상이어야 한다.
- [x] 모든 `Product` 목록을 조회할 수 있다.

### 메뉴
- [x] `MenuGroup`은 고유식별자와 `MenuGroupName`을 갖는다.
  - [x] `MenuGroupName`은 공백일 수 없다.
- [x] `Menu`는 특정 `MenuGroup`에 속한다.
- [ ] `Menu`는 고유식별자와 `MenuName`, `MenuPrice`, `MenuProducts`, `display`를 가진다.
  - [x] `MenutName`에는 `Profanity`가 포함될 수 없다.
  - [ ] `Menu` 등록시, `MenuPrice`는 `MenuProductPrice`들의 합보다 작거나 같아야 한다.
  - [ ] `ProductPrice` 변경시, `MenuPrice`가 `MenuProductPrice`들의 합보다 크면 `Menu`의 `display` 속성이 변하여(`hide`) 노출되지 않는다.
- [x] `MenuProduct`는 `Menu`와 `productId`와 `MenuProductQuantity`를 가진다.

### 매장 주문
- `OrderTable`은 고유식별자와 `OrderTableName`, `NumberOfGuests`, `Occupied`를 갖는다.
- `OrderTable`의 모든 `EatInOrder`가 `completed`가 되면, `clear` 한다.
- `clear`를 하면, `Occupied`가 false가 되고 `NumberOfGuests`가 0이 된다.
- `EatInOrder`는 고유식별자와 `EatInOrderStatus`, `EatInOrderDateTime`, `EatInOrderLineItem` 목록을 가진다.
- `EatInOrder`가 등록될 때 `Menu`는 `display` 중이어야하고, `MenuPrice`와 `EatInOrderLineItemPrice`가 일치 해야한다.
- `EatInOrderStatus`는 `waiting`-`accepted`-`served`-`completed` 순으로 진행된다.
- `EatInOrderLineItem`은 고유식별자와 `EatInOrderLineItemPrice`, `EatInOrderLineItemQuantity`를 갖는다.

### 배달 주문
- `DeliveryOrder`는 고유식별자와 `DeliveryOrderStatus`, `DeliveryOrderDateTime`, `DeliveryOrderLineItem` 목록을 가진다.
- `DeliveryOrder`가 등록될 때 `Menu`는 `display` 중이어야하고, `MenuPrice`와 `DeliveryOrderLineItemPrice`가 일치 해야한다.
- `DeliveryOrderStatus`는 `waiting`-`accepted`-`served`-`delivering`-`delivered`-`completed` 순으로 진행된다.
  - `DeliveryOrder`가 `accepted` 되면 `kitchen rider`를 호출한다.
- `DeliveryOrderLineItem`은 고유식별자와 `DeliveryOrderLineItemPrice`, `DeliveryOrderLineItemQuantity`를 갖는다.

### 포장 주문
- `TakeoutOrder`는 고유식별자와 `TakeoutOrderStatus`, `TakeoutOrderDateTime`, `TakeoutOrderLineItem` 목록을 가진다.
- `TakeoutOrder`가 등록될 때 `Menu`는 `display` 중이어야하고, `MenuPrice`와 `TakeoutOrderLineItemPrice`가 일치 해야한다.
- `TakeoutOrderStatus`는 `waiting`-`accepted`-`served`-`completed` 순으로 진행된다.
- `TakeoutOrderLineItem`은 고유식별자와 `TakeoutOrderLineItemPrice`, `TakeoutOrderLineItemQuantity`를 갖는다.

---

- [ ] 메뉴 엔티티 우선 구성 후, 가격과 관련된 정책 리팩터링
