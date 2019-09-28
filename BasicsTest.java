public class BasicsTest{
    public static void main(String[] args){
        Basics test = new Basics();
        test.allnumbers(255);
        test.odds(255);
        test.sum(255);
        int[] i = {1,3,5,27,9,13};
        test.iterate(i);
        test.max(i);
        test.avg(i);
        test.moreThan(i, 5);
        test.doubleA(i);
        test.noNegs(i);
        System.out.println(test.oddArr(255));
        System.out.print(test.mathStuff(i));
        System.out.print(test.rev(i));
    }
}