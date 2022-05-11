/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

public class Trainee extends Saler{
    
    public Trainee(String name, Double salesDoanhSo, Double Bonus) {
        super(name, salesDoanhSo, Bonus);
    }
    
    
    public Trainee() {
		// TODO Auto-generated constructor stub
	}


	@Override
    public Double getBonus() {
        
        return 0.0;
    }
}