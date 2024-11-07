/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture5arrays;
import java.util.Scanner;

public class Calculate {
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
        
        // Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        // Tính trung bình (cần kiểm tra tránh chia cho 0)
        double average = (n > 0) ? (double) sum / n : 0;  // Tránh chia cho 0
        
        // In ra tổng và trung bình
        System.out.println("Tong cac phan tu trong mang : " + sum);
        System.out.println("Trung binh cua cac phan tu trong mang : " + average);
        
        
    }
}