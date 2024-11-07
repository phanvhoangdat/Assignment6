/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture5arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập kích thước mảng
        System.out.print("Nhap so luong phan tu trong mang : ");
        int n = scanner.nextInt();
        
        // Khai báo mảng số nguyên
        int[] arr = new int[n];
        
        // Nhập các phần tử của mảng
        System.out.println("Nhap cac phan tu cua mang :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sắp xếp mảng theo thứ tự tăng dần8
        Arrays.sort(arr);
        
        // In ra mảng đã sắp xếp
        System.out.println("Mang sau khi sap xep theo thu tu tang dan :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Đóng Scanner
        scanner.close();
    }
}