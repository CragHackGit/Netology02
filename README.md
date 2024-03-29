# Домашнее задание к занятию «Примитивные типы данных и условные операторы»

## Задание 1. Мили (обязательное к выполнению)

#### Условие

Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
Формула  расчёта следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.

#### Ваша задача

Создать приложение, рассчитывающее количество начисленных миль за купленный билет.
Стоимость билета вы выбираете сами — сами заполняете переменную, в которой она будет храниться.

#### Пример схемы кода вашего приложения:

```java
public class Main {
  public static void main(String[] args) {
  
    // Объявляете переменные для входных данных и
    // параметров программы: одну для хранения 
    // стоимости билета, другую для хранения количества
    // рублей для одной бонусной мили
    
    // Рассчитываете количество бонусных миль, используя
    // значения заведённых переменных. Ответ сохраняете в
    // новую переменную и выводите на экран
  }
}
```
# Домашнее задание к занятию «Testability, автотесты, введение в ООП: объекты и методы»
## Задание 1. Мили — модернизация (обязательное к выполнению)

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать [приложение для расчёта миль](./PRIMITIVES.md). Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в Main мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

#### Этапы выполнения
1. Создайте класс `BonusMilesService` (`File -> New -> Java Class`, вводите название и нажимаете `Enter`).
1. Определите в нём метод `calculate`, который:
    1. принимает на вход один параметр: `cost` типа `int`;
    1. анализируя значение переданного параметра, возвращает рассчитанное количество миль (тип — `int`).
    
Разместите следующий код в классе `Main`:

```java
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
```

Убедитесь, что выводимое в консоль значение соответствует результатам предыдущей версии приложения.

#### Результат
На проверку отправьте ссылку на ваш публичный репозиторий GitHub с решением.
