public class LogicalOpTemaWhileLoop {

//ex 1
     public void countTo100(int number) {
        while (number <= 100) {
            System.out.print(number+" ");
            number++;
        }
    }
//ex 2
public void counttoMinus100(int number) {
    while (number >= -100) {
        System.out.print(number+" ");
        number--;
    }
}
//ex 3
public void countfirstandsec(int first, int second) {
    while (first <= second) {
        System.out.print(first+" ");
        first++;
    }
}
//ex 4
public void countDescrEx4(int first, int second) {
    if(first < second){
        while (first <= second) {
            System.out.print(second+" ");
            second--;
        }
    }
    else if(second < first){
        while (second <= first) {
            System.out.print(first+" ");
            first++;
        }
    }
}
//ex 5
public void printevenNumbers() {
    int a = 1;
    while (a <= 100) {
        a++;
        if (a % 2 == 0) {
            System.out.print(a+" ");
        }
    }
}
//ex 6
public void printOddNumbers() {
    int a = 1;
    while (a <= 100) {
        a++;
        if (a % 2 != 0) {
            System.out.print(a+" ");
        }
    }
}
//ex 7
public float sumAverageCountWHILEex7(int first, int last){
    float sum= 0;
    int count= 0;
        while(first<=last){
            sum = sum + first;
            count++;
            first++;
        }
        return sum/count;
    }
//ex 8
public float divideby7(float first, float second) {
    float count = 0;
    float sum = 0;
    while (first <= second) {
        if (first % 7 == 0) {
            count ++;
            sum += first;
        }
        first++;
    }
    float average = sum / count;
    return average;
}
//ex 9
public void printnrFibonacci() {
    int count = 20;
    int numOne = 0;
    int numTwo = 1;
    int i=1;
    while(i<=count)
    {
        System.out.print(numOne+" ");
        int sumnum1and2 = numOne + numTwo;
        numOne = numTwo;
        numTwo = sumnum1and2;
        i++;
    }
}
//ex 10

//nu am stiut sa-l fac



}
