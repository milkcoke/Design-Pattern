package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Client;
import m.falcon.designpattern.createpattern.domain.ship.Ship;

public interface ShipFactory {

    default Ship orderShip(Client client, String orderShipName) {
        validateClient(client);
        validateShipName(orderShipName);
        Ship ship = create();
        sendEmailToClient(client.getEmail(), ship);

        return ship;
    }

    Ship create();

    private void validateClient(Client client) {
        if (client.getName() == null || client.getName().isBlank()) {
            throw new IllegalArgumentException("주문 고객 이름을 입력해주세요");
        }
        if (client.getEmail() == null || client.getEmail().isBlank()) {
            throw new IllegalArgumentException("주문 고객 이메일을 입력해주세요");
        }
    }

    private void validateShipName(String orderShipName) {
        if (orderShipName.equalsIgnoreCase("white-ship")) {

        } else if (orderShipName.equalsIgnoreCase("black-ship")) {

        } else {
            throw new IllegalArgumentException("주문할 수 없는 배압니다.");
        }
    }

    private void sendEmailToClient(String clientEmail, Ship ship) {
        System.out.println(clientEmail + "로 주문 정보 발송되었습니다.");
    }
}
