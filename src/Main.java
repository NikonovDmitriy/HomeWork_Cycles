public class Main {


    public static void main(String[] args) {
        //Задание 1
        int a = 1;
        while (a<=10){
            System.out.print(a+" ");
            a++;
        }
        System.out.print("\n");
        for(int b=10; b>0; b=b-1){

            System.out.print(b+" ");
        }

        //Задание 2
        System.out.print("\n");
        for(int c = 5; c<=31&&c>=5; c=c+7){
            System.out.println("Сегодня пятница, "+c+"-е число. Необходимо подготовить отчет.");
        }

        //Задание 3
        System.out.print("\n");
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for(int d = start; d>=start&&d<=end; d=d+79)
        if (d%79==0)
        {
            System.out.println(d+" ");
        }
//3 Задание не понял, хотелось бы получить понимание и разбор..!

    }
}