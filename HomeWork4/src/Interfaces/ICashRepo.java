package Interfaces;

import Models.BankAccount;

import java.util.List;

/**
 * Интерфейс взаимодействия с базой банковских операций
 */
public interface ICashRepo {
    /**
     * Метод проведения транзакции
     *
     * @param payment  платеж
     * @param cardFrom карта покупателя
     * @param cardTo   карта продавца
     * @return результат выполнения операции
     */
    boolean transaction(int payment, long cardFrom, long cardTo);

    /**
     * Метод получения списка клиентов "банка"
     *
     * @return результат выполнения операции
     */
    List<BankAccount> getClients();//Не уверен, что можно расширить интерфейс, но мне показалось это лучшим решением.
}

