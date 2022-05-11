package data;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Saler NV1BH = new  Saler();
     NV1BH.setName("Nguyễn Huy Tường ");
     NV1BH.setSalesDoanhSo(332000.0);
     NV1BH.getBonus();
     System.out.println("Name : " + NV1BH.getName() + "DOANH Số : " + NV1BH.getSalesDoanhSo() + "Thưởng : " + NV1BH.getBonus());
     Saler NV2BH = new  Saler();
     NV1BH.setName("Nguyễn Văn Toàn ");
     NV1BH.setSalesDoanhSo(40000.0);
     NV1BH.getBonus();
     System.out.println("Name : " + NV1BH.getName() + "DOANH Số : " + NV1BH.getSalesDoanhSo() + "Thưởng : " + NV1BH.getBonus());
     Saler NVTT = new Trainee();
     NVTT.setName("Nguyễn Thị Hoa");
     NVTT.setSalesDoanhSo(50000.0);
     NVTT.getBonus();
     System.out.println("Name : " + NVTT.getName() + "DOANH Số : " + NVTT.getSalesDoanhSo() + "Thưởng : " + NVTT.getBonus());
     
	}

}