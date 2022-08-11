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
        for(int d = 2000; d<=d+200; d=d+79){
            System.out.println(d+" ");
        }
//3 Задание не понял, хотелось бы получить понимание и разбор..!

    }
}