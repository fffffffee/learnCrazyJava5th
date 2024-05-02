public class IntegerValTest
{
    //下面代码是正确的，系统会自动把56当成byte类型处理
    byte a = 56;
    /*
    下面代码是错误的，系统不会把9999999999999当成long类型处理
    所以超出int的表数范围，从而引起错误
    */
    // long bigValue = 9999999999999;
    // 下面代码是正确的，在巨大的整数值后使用L后缀，强制使用long类型
    long bigValuee2 = 9223372036854775807L;
    //以下0开头的整数值是八进制的整数
    int octalValue = 013;
    //以0x或0X开头的整数值是十六进制的整数
    int hexValue1 = 0x13;
    int hexValue2 = 0xaF;
    //定义两个8位的二进制整数
    int binVal1 = 0b11010100;
    int binVal2 = 0B11010100;
    //定义一个32位的二进制整数，最高位是符号位
    int binVal3 = 0B10000000000000000000000000000011;
    System.out.println(binVal1);//输出212
    System.out.println(binVal2);//输出105
    System.out.println(binVal3);//输出-2147483645
}



	

