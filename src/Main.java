public class Main {
    public static void Task1()
    {
        System.out.println("Задача 1:");
        byte workingHours = 8;
        short salaryPerMonth = 1667;
        int salaryPerYear = 200_000;
        long peopleOnEarth = 7_000_000_000L;
        float price = 120.99f;
        double pi = 3.141592;
        System.out.println("Значение переменной workingHours с типом byte равно " + workingHours);
        System.out.println("Значение переменной salaryPerMonth с типом short равно " + salaryPerMonth);
        System.out.println("Значение переменной salaryPerYear с типом int равно " + salaryPerYear);
        System.out.println("Значение переменной peopleOnEarth с типом long равно " + peopleOnEarth);
        System.out.println("Значение переменной price с типом float равно " + price);
        System.out.println("Значение переменной pi с типом double равно " + pi);
    }
    public static void Task2()
    {
        System.out.println("\nЗадача 2:");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void Task3()
    {
        System.out.println("\nЗадача 3:");
        byte lpPupils = 23;
        byte asPupils = 27;
        byte eaPupils = 30;
        short sheetsAmount = 480;
        int sheetsPerPupil = 480/(lpPupils+asPupils+eaPupils);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");
    }
    private static void Task4()
    {
        System.out.println("\nЗадача 4:");
        byte bottlesPerMin = 16 / 2;
        short bottlesPer20Min = (short)(bottlesPerMin * 20);
        short botllesPerDay = (short)(bottlesPerMin * 60 * 24);
        int botllesPer3Day = botllesPerDay * 3;
        int botllesPerMonth = botllesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        System.out.println("За сутки минут машина произвела " + botllesPerDay + " штук бутылок");
        System.out.println("За 3-ое суток машина произвела " + botllesPer3Day + " штук бутылок");
        System.out.println("За месяц (30 дней) машина произвела " + botllesPerMonth + " штук бутылок");
    }
    private static void Task5()
    {
        System.out.println("\nЗадача 5:");
        byte paintJars = 120;
        byte whitePaintJars = 2;
        byte brownPaintJars = 4;
        byte schoolRooms = (byte) (paintJars / (whitePaintJars + brownPaintJars));
        byte whitePaintJarsTotal = (byte) (whitePaintJars * schoolRooms);
        byte brownPaintJarsTotal = (byte) (brownPaintJars * schoolRooms);
        //В школе, где … классов, нужно … банок белой краски и … банок коричневой краски
        System.out.println("В школе, где " + schoolRooms + " классов, нужно " + whitePaintJarsTotal + " банок белой краски и "
                + brownPaintJarsTotal + " банок коричневой краски");
    }
    private static void Task6()
    {
        System.out.println("\nЗадача 6:");
        byte bananaMass = 80;
        byte milkMass = 105;
        byte iceCreamBriquetteMass = 100;
        byte eggMass = 70;
        byte bananasAmount = 5;
        byte milkAmount = 2;
        byte iceCreamBriquettesAmount = 2;
        byte eggsAmount = 4;
        short totalMass = (short) (bananaMass * bananasAmount + milkMass * milkAmount +
                iceCreamBriquetteMass * iceCreamBriquettesAmount + eggMass * eggsAmount);
        short gramPerKilogram = 1000;
        float totalMassKG = (float) totalMass / gramPerKilogram;
        System.out.println("Масса данного спортзавтрака в граммах равна " + totalMass);
        System.out.println("Масса данного спортзавтрака в килограммах равна " + totalMassKG);
    }
    private static void Task7()
    {
        System.out.println("\nЗадача 7:");
        byte needToLoseMassInKG = 7;
        short gramPerKilogram = 1000;
        short needToLoseMass = (short) (needToLoseMassInKG * gramPerKilogram);
        short canLoseMassMin = 250;
        short canLoseMassMax = 500;
        byte maxDays = (byte) (needToLoseMass / canLoseMassMin);
        byte minDays = (byte) (needToLoseMass / canLoseMassMax);
        short canLoseMassAverage = (short) ((canLoseMassMin + canLoseMassMax) / 2);
        float averageDays = (float) needToLoseMass / canLoseMassAverage;
        System.out.println (maxDays + " дней уйдет на похудение, если спортсмен будет терять каждый день по "
                + canLoseMassMin + " грамм");
        System.out.println (minDays + " дней уйдет на похудение, если спортсмен будет терять каждый день по "
                + canLoseMassMax + " грамм");
        System.out.println (averageDays + " дней уйдет на похудение, если спортсмен будет терять каждый день " +
                "в среднем по " + canLoseMassAverage + " грамм");
    }
    private static void Task8()
    {
        System.out.println("\nЗадача 8:");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        float coefficient = 1.10f;
        byte monthsPerYear = 12;

        int mashaSalaryPerYear = mashaSalary * monthsPerYear;
        int denisSalaryPerYear = denisSalary * monthsPerYear;
        int kristinaSalaryPerYear = kristinaSalary * monthsPerYear;
        int mashaIncSalary = (int) (mashaSalary * coefficient);
        int denisIncSalary = (int) (denisSalary * coefficient);
        int kristinaIncSalary = (int) (kristinaSalary * coefficient);
        int mashaIncSalaryPerYear = mashaIncSalary * monthsPerYear;
        int denisIncSalaryPerYear = denisIncSalary * monthsPerYear;
        int kristinaIncSalaryPerYear = kristinaIncSalary * monthsPerYear;
        int diffMashaSalaryPerYear = mashaIncSalaryPerYear - mashaSalaryPerYear;
        int diffDenisSalaryPerYear = denisIncSalaryPerYear - denisSalaryPerYear;
        int diffKristinaSalaryPerYear = kristinaIncSalaryPerYear - kristinaSalaryPerYear;

        System.out.println ("Маша теперь получает " + mashaIncSalary + " рублей в месяц. Годовой доход вырос на "
                + diffMashaSalaryPerYear + " рублей");
        System.out.println ("Денис теперь получает " + denisIncSalary + " рублей в месяц. Годовой доход вырос на "
                + diffDenisSalaryPerYear + " рублей");
        System.out.println ("Кристина теперь получает " + kristinaIncSalary + " рублей в месяц. Годовой доход вырос на "
                + diffKristinaSalaryPerYear + " рублей");

    }
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }
}