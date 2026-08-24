package Stream;

//Условие:
//У тебя
//есть список
//заказов.Найди имя
//клиента,
//который сделал
//самый дорогой
//заказ среди
//всех.Если список
//заказов пуст —
//верни строку "Нет заказов".Использовать if/else
//для проверки
//на null нельзя!
//
//Входные данные:


import java.util.Comparator;
import java.util.List;

public class OrderTask {
    record Order(String customer, String city, double amount, List<String> items) {
    }

    public static String getCustomerName(List<Order> list) {
        return list.stream()
                .max(Comparator.comparingDouble(Order::amount))
                .map(Order::customer)
                .orElse("Нет заказов");
    }

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Аня", "Москва", 1500, List.of("книга", "ручка")),
                new Order("Боря", "Питер", 300, List.of("ручка")),
                new Order("Вика", "Москва", 9000, List.of("ноутбук", "мышь", "коврик")),
                new Order("Гена", "Казань", 750, List.of("книга")),
                new Order("Аня", "Москва", 2200, List.of("монитор", "кабель")),
                new Order("Боря", "Питер", 120, List.of("ручка", "тетрадь", "приставка"))

        );

        System.out.println(getCustomerName(orders));

    }

//    Условие:
//    Нам нужно
//    срочно найти, кто
//    из клиентов
//    заказал "игровую приставку".
//    Найди первый
//    заказ,
//    в списке товаров(items) которого есть эта позиция.
//    Если такой
//    заказ найден, выведи
//    в консоль:"Приставку заказал(а): [Имя]".
//    Если никто
//    не заказал —выведи "Приставка никому не нужна".Подсказка:
//    используй метод
//    Optional для
//    выполнения действия, чтобы
//    не писать if-else.

    public static void consoleBuyerFinder(List<Order> orders) {
        orders.stream()
                .filter(order ->
                        order.items().contains("приставка"))
                .findFirst()
                .ifPresentOrElse(
                        order ->
                                System.out.println("Приставку заказал(а):"
                                        + order.customer),
                        () ->
                                System.out.println("Приставка никому не нужна")

                );
    }

//    Условие:
//    Найти название
//    города того
//    клиента,
//    который заказал
//    больше всего
//
//    товаров суммарно(не по стоимости, а по количеству штук items.size()).
//    Если список
//    заказов пуст, метод
//    должен выбросить
//    исключение IllegalArgumentException
//    с сообщением "Заказы не найдены".
        public static String findCity(List<Order> orders){
        return orders.stream()
                .max(Comparator.comparingInt(order ->
                        order.items.size()))
                .map(Order::city)
                .orElseThrow(()->
                       new IllegalArgumentException("Заказы не найдены") );
        }
}
