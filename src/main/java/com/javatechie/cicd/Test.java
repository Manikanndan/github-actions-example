import org.junit.Test;

public class Test {

    @Test
    public void test1(){
        System.out.println("Executing Addition Test");
        assert 3 == MathsClass.add(1,2);
    }

    @test
    public void test2(){
        System.out.println("Executing Multi[lication] Test");
        assert 12 == MathsClass.multiply(6,2);
    }

}