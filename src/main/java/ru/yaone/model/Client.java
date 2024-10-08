package ru.yaone.model;

/**
 * Запись (record), представляющая клиента.
 * <p>
 * Данный класс хранит информацию о клиенте, включая
 * информацию о пользователе и контактные данные.
 * Используется для представления данных о клиентах в системе.
 * </p>
 *
 * @param user        объект пользователя, представляющий клиента
 * @param contactInfo контактная информация клиента,
 *                    такая как телефонный номер или адрес электронной почты
 */
public record Client(User user, String contactInfo) {
}