public class TaskSix {
    //Todo: 6.	Даны целые положительные числа A и B (A>B).
    // На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    // Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
        public static void main(String[] args) {
            int a, b, segments;
            a = 110;
            b = 40;

            segments = a / b;

            System.out.println("Кол-во отрезков = " + segments);

        }
}
