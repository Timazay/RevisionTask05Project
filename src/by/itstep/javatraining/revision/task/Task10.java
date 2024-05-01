package by.itstep.javatraining.revision.task;

/*	Task 10. Intersection of Segments [пересечение отрезков]
 *
 *  На числовой прямой даны два отрезка: [a1; b1] и [a2; b2].
 *  Найдите их пересечение с использованием эффективного, но простого алгоритма.
 *
 *  Примечание
 *  Пересечением двух отрезков может быть:
 *  1) отрезок [a, b];
 *  2) точка (point - number);
 *  3) пустое множество (empty set).
 *
 *	Формат входных данных [input]
 *  На вход метод получает четыре целых числа типа int: a1, b1, a2, b2,
 *  которые задают соответствующие отрезки. Концы соответствующих отрезков
 *  могут задаваться неупорядоченно.
 *
 *  Формат выходных данных [output]
 *	Метод должен возвратить строку, которая может содержать следующее:
 *  1) границу отрезка в формате "segment - [a, b]", являющегося пересечением;
 *  2) общую точку в формате "point - number", где number - число;
 *  3) "empty set" - «пустое множество», если у отрезков нет пересечения;
 *  4) "error", если данные заданы некорректно.
 *
 *	[ input 1]: 1 3 2 4
 *	[output 1]: segment - [2, 3]
 *
 *	[ input 5]: 3 1 2 4
 *	[output 5]: segment - [2, 3]
 *
 *	[ input 2]: 1 2 2 3
 *	[output 2]: point - 2
 *
 *	[ input 3]: 1 2 3 4
 *	[output 3]: empty set
 *
 *	[ input 4]: 2 2 3 4
 *	[output 4]: error
 */

public class Task10 {
    public static String start(int a1, int b1, int a2, int b2) {
        if (a1 == b1 || b2 == a2) {
            return "error";
        }
        int min1 = Math.min(a1, b1);
        int max1 = Math.max(a1, b1);
        int min2 = Math.min(a2, b2);
        int max2 = Math.max(a2, b2);


        int left = Math.max(min1, min2);
        int right = Math.min(max1, max2);

        if (left > right) {
            return "empty set";
        } else if (left == right) {
            return "point - " + left;
        } else {
            return "segment - [" + left + ", " + right + "]";
        }
    }

}