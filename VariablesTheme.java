public class VariablesTheme {
    
    public static void main(String[] args) {
    //1.Вывод характеристик компьютера
    byte cpu = 2;
    short ram = 8;
    int ssd = 128;
    long batt = 7200L;
    float freqCpu = 1.8f;
    double version = 12.6d;
    boolean active = true;
    char os = 'M';

    System.out.println("Вывод характеристик компьютера");
    System.out.println("Количество ядер: " + cpu);
    System.out.println("Размер ОЗУ, Гб: " + ram);
    System.out.println("Размер ПЗУ, Гб: " + ssd);
    System.out.println("Емкость батареи: " + batt);
    System.out.println("Частота процессора, ГГц: " + freqCpu);
    System.out.println("Версия ОС: " + version);
    System.out.println("Состояние: " + active);
    System.out.println("Литера ОС: " + os);
    System.out.print("\n");

    //2.Расчет стоимости товара со скидкой
    int penCost = 100;
    int bookCost = 200;
    int commonCost = penCost + bookCost;
    double sale = commonCost * 0.11;
    double lastCost = commonCost - sale;

    System.out.println("Расчет стоимости товара со скидкой");
    System.out.println("Общая стоимость товаров без скидки: " + commonCost);
    System.out.println("Сумма скидки: " + sale);
    System.out.println("Общая стоимость товаров со скидкой: " + lastCost);
    System.out.print("\n");

    //3.Вывод слова JAVA
    System.out.println("Вывод слова JAVA");
    System.out.println("   J    a  v     v  a");
    System.out.println("   J   a a  v   v  a a");
    System.out.println("J  J  aaaaa  V V  aaaaa");
    System.out.println(" JJ  a     a  V  a     a");
    System.out.print("\n");

    //4.Вывод min и max значений целых числовых типов
    byte num1 = 127;
    short num2 = 32767;
    int num3 = 2147483647;
    long num4 = 9223372036854775807L;

    System.out.println("Вывод min и max значений целых числовых типов");
    System.out.println("первоначальное значение: " + num1);
    System.out.println("значение после инкремента на единицу: " + num1++);
    System.out.println("значение после декремента на единицу: " + num1--);
    System.out.println("первоначальное значение: " + num2);
    System.out.println("значение после инкремента на единицу: " + num2++);
    System.out.println("значение после декремента на единицу: " + num2--);
    System.out.println("первоначальное значение: " + num3);
    System.out.println("значение после инкремента на единицу: " + num3++);
    System.out.println("значение после декремента на единицу: " + num3--);
    System.out.println("первоначальное значение: " + num4);
    System.out.println("значение после инкремента на единицу: " + num4++);
    System.out.println("значение после декремента на единицу: " + num4--);
    System.out.print("\n");

    //5.Перестановка значений переменных
    int a = 2;
    int b = 5;
    int c = a;

    System.out.println("Перестановка значений переменных");
    System.out.println("с помощью третьей переменной: " + "a = " + a + ", " + "b = " + b);
    System.out.println("новые значения переменных: " + "a = " + (a = b) + ", " + "b = " + (b = c));
    System.out.println("с помощью арифметических операций: " + "a = " + a + ", " + "b = " + b);
    System.out.println("новые значения переменных: " + "a = " + (a = a + b - (b = a)) + ", " + "b = " + (b = a + b - a));
    System.out.println("с помощью побитовой операции ^: " + "a = " + a + ", " + "b = " + b);
    System.out.println("новые значения переменных: " + "a = " + (a ^= b ^= a) + ", " + "b = " + (b ^= a));
    System.out.print("\n");

    //6.Вывод символов и их кодов: 35, 38, 64, 94, 95
    char c1 = '#';
    char c2 = '&';
    char c3 = '@';
    char c4 = '^';
    char c5 = '_';

    System.out.println("Вывод символов и их кодов");
    System.out.println("Код символа: " + (int) c1 + " Символ: " + c1);
    System.out.println("Код символа: " + (int) c2 + " Символ: " + c2);
    System.out.println("Код символа: " + (int) c3 + " Символ: " + c3);
    System.out.println("Код символа: " + (int) c4 + " Символ: " + c4);
    System.out.println("Код символа: " + (int) c5 + " Символ: " + c5);
    System.out.print("\n");

    //7.Вывод в консоль ASCII-арт Дюка
    char ch1 = '/';
    char ch2 = '\\';
    char ch3 = '_';
    char ch4 = '(';
    char ch5 = ')';

    System.out.println("Вывод в консоль ASCII-арт Дюка");
    System.out.println("    " + ch1 + "" + ch2);
    System.out.println("   " + ch1 + "  " + ch2);
    System.out.println("  " + ch1 + "" + ch3 + "" + ch4 + " " + ch5 + "" + ch2);
    System.out.println(" " + ch1 + "      " + ch2);
    System.out.println(ch1 + "" + ch3 + "" + ch3 + "" + ch3 + "" + ch3 + "" + ch1 + "" + ch2 + ""+ ch3 + "" + ch3 + "" + ch2);
    System.out.print("\n");

    //8.Вывод количества сотен, десятков и единиц числа
    int n = 123;
    int x = n / 10 / 10 % 10;
    int y = n / 10 % 10;
    int z = n % 10;
    int sum = x + y + z;
    int mult = x * y * z;

    System.out.println("Вывод количества сотен, десятков и единиц числа");
    System.out.println("Число " + n + " содержит:");
    System.out.println(x + " сотен");
    System.out.println(y + " десятков");
    System.out.println(z + " единиц");
    System.out.println("Сумма его цифр = " + sum);
    System.out.println("Произведение = " + mult);
    System.out.print("\n");

    //9.Вывод времени
    int t = 86399;
    int hh = t / 3600;
    int mm = t / 60 % 60;
    int ss = t / 1 % 60;

    System.out.println("Вывод времени");
    System.out.println(hh + ":" + mm + ":" + ss);
    }
}