package file_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
* Created by Елена on 16.02.2015.
*/

public class NewFileTestClass {

    @Test
    public void SomeTest4(){
        File file1 = new File("E:\\TestTxt2.txt");
        FileReader filer = null;
        try {
            filer = new FileReader(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = null;
        try {
            sc = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s1;
        s1 = sc.nextLine();
        boolean s0 = s1.matches("^\\d+(\\.\\d+)?");
        Assert.assertEquals(s0, true);
    }
}


