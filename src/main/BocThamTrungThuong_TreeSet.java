package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//	Set là một interface kế thừa từ Collection interface trong java. Set trong đây là một Collection không thể chứa các phần tử trùng lặp
//Thứ tự phần tử: HashSet không đảm bảo thứ tự của các phần tử được lưu trữ, 
//trong khi TreeSet sắp xếp các phần tử theo thứ tự tăng dần hoặc theo một Comparator được chỉ định.
public class BocThamTrungThuong_TreeSet {
	@SuppressWarnings("unused")
	Set<String> tapHop = new TreeSet<String>();

	public BocThamTrungThuong_TreeSet() {

	}

//1
	public boolean Them(String giaTri) {
		return this.tapHop.add(giaTri);
	}

//2
	public boolean Xoa(String giaTri) {
		return this.tapHop.remove(giaTri);
	}

//3
	public boolean KTPhieu(String giaTri) {
		return this.tapHop.contains(giaTri);
	}

//4
	public void XoaAll() {
		this.tapHop.clear();
	}

//5
	public int SoLuong() {
		return this.tapHop.size();
	}

//6
	public String rutTham() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.tapHop.size());
		return ketQua = (String) this.tapHop.toArray()[viTri];
	}

//7	
	public void inTatCa() {
		System.out.println(Arrays.toString(this.tapHop.toArray()));
	}

	public static void main(String[] args) {

		int luaChon = 0;
		BocThamTrungThuong_TreeSet rt = new BocThamTrungThuong_TreeSet();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Press any keydown to continue...");
			String next = sc.nextLine();
			if (next == "")
				continue;
			System.out.println("------------MENU------------");
			System.out.println("1. Thêm mã số.");
			System.out.println("2. Xoá mã số.");
			System.out.println("3. Kiểm tra mã số có tồn tại ?");
			System.out.println("4. Xoá tất cả mã số.");
			System.out.println("5. Số lượng mã số.");
			System.out.println("6. Rút thăm mã số.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình.");

			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập vào mã phiếu dự thưởng: ");
				String giatri = sc.nextLine();
				if (luaChon == 1) {
					int check = rt.SoLuong();
					rt.Them(giatri);
					if (rt.SoLuong() > check) {
						System.out.println("Thêm giá trị thành công.");
					} else {
						System.out.println("Không thêm được các phần tử trùng lặp vào mảng.");
					}
				}

				else if (luaChon == 2) {
					if (rt.KTPhieu(giatri)) {
						rt.Xoa(giatri);
						System.out.println("Xoá giá trị thành công.");
					} else {
						System.out.println("Không có giá trị này !!!");
					}
				}

				if (luaChon == 3) {
					System.out.println("Kết quả kiểm tra: " + rt.KTPhieu(giatri));
				}
			} else if (luaChon == 4) {
				rt.XoaAll();
				System.out.println("Đã xoá các giá trị trong mảng.");
			} else if (luaChon == 5) {
				System.out.println("Số lượng phiếu dự thưởng là: " + rt.SoLuong());
			} else if (luaChon == 6) {
				System.out.println("Mã số trúng thưởng là: " + rt.rutTham());
			} else if (luaChon == 7) {
				System.out.println("Tất cả các mã phiếu dự thưởng là: ");
				rt.inTatCa();
			}
		} while (luaChon != 0);
		System.out.println("Cảm ơn bạn đã sử dụng chương trình này.");
	}
}
