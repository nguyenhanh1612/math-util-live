/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //n! = 1.2.3.4...n
    //Quy ước 0! = 1! = 1
    //Ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21!, ko tính
    //một cái ngoại lệ ko tính được
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
        //hàm dừng liền ko cần return
        
        //xuống đến đây là n = 0...20 rồi
        if(n == 0 || n == 1)
            return 1; //dừng ngay khi n đặc biệt
        
        //xuống đến đây n = 2...20 rồi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bưu dồn thịt
        //i = 2, i = 3, i = 4, i = 5,...i = n nhồi liên tục i vào tích
        long product = 1; //tích khởi đầu = 1, nhồi 2 3 4 5 6...n
        for (int i = 2; i <= n; i++){
            product = product * i;
//            product *= i; //product = product đang có nhân con i, đập ngược trở lại
        } //nhân từ 2 đến n
        return product;
    }
}
