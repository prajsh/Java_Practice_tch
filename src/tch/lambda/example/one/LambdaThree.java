package tch.lambda.example.one;

interface NumbericTestTwo{
    boolean test (int n, int d);
}

public class LambdaThree {
    public static void main(String[] args) {
        NumbericTestTwo isFactor = (n,d) -> (n%d)==0;
        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
