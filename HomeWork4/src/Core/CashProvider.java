package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.BankAccount;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

import java.util.List;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {
    private long cardNumber;
    private boolean isAutorized;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;


    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    public boolean buy(Ticket ticket) throws RuntimeException {
        Carrier carrier = carrierRepository.read(1);
        if (cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber())) {
            return true;
        }
        ;
        throw new RuntimeException("Ticket not purchased");
        // подсказка  Carrier carrier = carrierRepository.read(1);
        // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        // ???
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     * @return void
     * @throws RuntimeException
     */
    public void authorization(User client) throws RuntimeException {
        List<BankAccount> arrClients = cashRepository.getClients(); // Не уверен, что можно расширить интерфейс, но
        // мне показалось это лучшим решением, поскольку архитектор не предусмотрел получение данных карты клиента от
        // банка для авторизации.
        if (arrClients == null) {
            throw new RuntimeException("There is no connection with the bank.");
        }
        for (int i = 0; i < arrClients.size(); i++) {
            if (arrClients.get(i).getCard() == client.getCardNumber()) {
                isAutorized = true;
                this.cardNumber = client.getCardNumber();//!!! Добавлено. После авторизации заполняем поле карты для
                // дальнейшей покупки.
                return;
            }
        }
        throw new RuntimeException("Ticket not purchased.");
    }//???
}
