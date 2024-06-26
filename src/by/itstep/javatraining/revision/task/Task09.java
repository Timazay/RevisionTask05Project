package by.itstep.javatraining.revision.task;

/*	Task 09. Next Date [дата следующего дня]
 *
 *  Заданы три целых числа d, m и y, которые задают некоторую дату по Грегорианскому календарю.
 *  Определите дату следующего дня.
 *
 *	Примечание
 *	1) Постарайтесь не использовать стандартную библиотеку работы со временем
 *  (задание закрепляет знания по использованию именно условных конструкций).
 *  2) Не забудьте про "защиту от дурака": все данные должны быть корректными.
 *  3) Отсчёт года идёт с нуля (наша эра), т.е. не должно быть отрицательного года.
 *
 *	Формат входных данных [input]
 *	На вход метод получает три целых числа типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить строку с соответствующей датой следующего дня
 *  в формате "DD.MM.YYYY" или "Error.", если данные введены некорректно.
 *
 *	[ input 1]: 3 5 2023
 *	[output 1]: 04.05.2023
 *
 *	[ input 2]: 28 2 2023
 *	[output 2]: 01.03.2023
 *
 *	[ input 3]: 28 2 2020
 *	[output 3]: 29.02.2020
 *
 *	[ input 4]: 30 2 2020
 *	[output 4]: Error.
 *
 *	[ input 5]: 1 13 2020
 *	[output 5]: Error.
 *
 *	[ input 6]: 1 1 -1
 *	[output 6]: Error.
 *
 *	[ input 7]: 1 1 1
 *	[output 7]: 02.01.0001
 */

public class Task09 {
    public static String start(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1) { return "Error."; }

        int maxDay;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            default:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
        }

        if (day > maxDay) {
            return "Error.";
        } else if (day == maxDay && month == 12) {
            return "01.01." + String.format("%04d", year + 1);
        } else if (day == maxDay) {
            return "01." + String.format("%02d", month + 1)
                    + "." + String.format("%04d", year);
        } else {
            return String.format("%02d", day + 1) + "."
                    + String.format("%02d", month)
                    + "." + String.format("%04d", year);
        }
    }

}