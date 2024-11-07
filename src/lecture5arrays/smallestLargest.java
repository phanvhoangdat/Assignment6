/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture5arrays;

import java.util.Scanner;

public class smallestLargest {

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

        // Khởi tạo các giá trị ban đầu cho min và max
        int min = arr[0];
        int max = arr[0];

        // Duyệt mảng để tìm phần tử nhỏ nhất và lớn nhất
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // In ra phần tử nhỏ nhất và lớn nhất
        System.out.println("Phan tu nho nhat trong mang: " + min);
        System.out.println("Phan tu lon nhat trong mang: " + max);
        
    }
}
