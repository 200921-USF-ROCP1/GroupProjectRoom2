package com.revature.app;

import java.util.Scanner;

import com.revature.services.ApartmentServiceImpl;
import com.revature.services.CarServiceImpl;
import com.revature.services.ConnectionService;
import com.revature.services.PetServiceImpl;
import com.revature.services.ResidentServiceImpl;

public class App {
	public static Scanner sc = new Scanner(System.in);
	private static ResidentServiceImpl rServ = new ResidentServiceImpl();
	private static ApartmentServiceImpl aServ = new ApartmentServiceImpl();
	private static PetServiceImpl pServ = new PetServiceImpl();
	private static CarServiceImpl cServ = new CarServiceImpl();
	
	
	public static void main(String[] args) {
		
		System.out.println(" -- Apartment Management System -- \n\n");
		while (true) { //continue until exit
			System.out.print("=:> ");
			String input = sc.nextLine();
			
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Stopping program....");
				return;
			} else if (input.trim() == "") //only spaces
				continue;
			
			
			switch (input.toLowerCase()) {
			case "movein": {
				rServ.moveIn();
				break;
			}
			case "moveout": {
				rServ.moveOut();
				break;
			}
			case "addpet": {
				pServ.addPet();
				break;
			}
			case "petdied": {
				pServ.removePet();
				break;
			}
			case "addcar": {
				cServ.addCar();
				break;
			}
			case "removecar": {
				cServ.removeCar();
				break;
			}
			case "vacant": {
				aServ.getEmptyApartments();
				break;
			}
			case "listpets": {
				aServ.getApartmentPets();
				break;
			}
			case "income": {
				aServ.getIncome();
				break;
			}			
			
			default: {
				System.out.println("Unknown command");
			}
			}
		}
	}
	
	public void finalize() {
		ConnectionService.closeConnection();
	}
 }
