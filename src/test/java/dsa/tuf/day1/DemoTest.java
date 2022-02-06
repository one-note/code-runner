package dsa.tuf.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DemoTest {

    @Test
    public void findDuplicateElement_1(){
        Demo demo = new Demo();
        int [] arr = {2,3,5,4,1,3};
        int actual = demo.findDuplicateElement(arr);
        Assertions.assertEquals(3,actual);
    }
    @Test
    public void findDuplicateElement_2(){
        Demo demo = new Demo();
        int [] arr = {2,3,5,4,1,6,5};
        int actual = demo.findDuplicateElement(arr);
        Assertions.assertEquals(5,actual);
    }
    @Test
    public void buildPascalTriangle_1(){
        Demo demo = new Demo();
        int rowNum=5;
        List<List<Integer>> result = demo.buildPascalTriangle(rowNum);
        result.forEach(list-> {
            for (int data : list) {
                System.out.print(data);}
            System.out.println();});
    }
    @Test
    public void buildPascalTriangle_2(){
        Demo demo = new Demo();
        int rowNum=10;
        List<List<Integer>> result = demo.buildPascalTriangle(rowNum);
        result.forEach(list-> {
            for (int data : list) {
                System.out.print(data);}
            System.out.println();});
    }
}
