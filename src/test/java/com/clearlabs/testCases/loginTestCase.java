package com.clearlabs.testCases;


import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class loginTestCase {
    @Test
    public void test_to_validate_isBlank_isEmpty(){
        String str1 = null;
        String str2 ="";
        String str3 = " ";
        Assert.assertTrue(StringUtils.isEmpty(str1));

/*        System.out.println(StringUtils.isEmpty(str1));
        System.out.println(StringUtils.isEmpty(str2));
        System.out.println(StringUtils.isEmpty(str3));
        System.out.println(str1 == null);
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());*/

    }
}
