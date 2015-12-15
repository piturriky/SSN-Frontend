package ssn.ws.clientsample;

import ssn.ws.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        SSNWSService service1 = new SSNWSService();
	        System.out.println("Create Web Service...");
	        SSNWS port1 = service1.getSSNWSPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.deleteReservation(Integer.parseInt(args[0])));
	        System.out.println("Server said: " + port1.createSport(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getUsersByEvent(Integer.parseInt(args[1])));
	        System.out.println("Server said: " + port1.deleteFieldSport(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
	        System.out.println("Server said: " + port1.createManagerEntity(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.registerUser(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getEventById(Integer.parseInt(args[4])));
	        System.out.println("Server said: " + port1.joinEvent(Integer.parseInt(args[5]),Integer.parseInt(args[6])));
	        System.out.println("Server said: " + port1.getEventsByFilters(Integer.parseInt(args[7]),Integer.parseInt(args[8]),Double.parseDouble(args[9]),null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getManagerEntities());
	        System.out.println("Server said: " + port1.getFieldById(Integer.parseInt(args[10])));
	        System.out.println("Server said: " + port1.addField(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.reportUser(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getManagerEntitiesByEvent(Integer.parseInt(args[11])));
	        System.out.println("Server said: " + port1.updateField(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getReportTypes());
	        System.out.println("Server said: " + port1.leaveEvent(Integer.parseInt(args[12]),Integer.parseInt(args[13])));
	        System.out.println("Server said: " + port1.getManagerEntitiesBySport(Integer.parseInt(args[14])));
	        System.out.println("Server said: " + port1.getEventsByUser(Integer.parseInt(args[15])));
	        System.out.println("Server said: " + port1.updateManagerEntity(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getEvents());
	        System.out.println("Server said: " + port1.getSportById(Integer.parseInt(args[16])));
	        System.out.println("Server said: " + port1.getFieldsByManagerEntity(Integer.parseInt(args[17])));
	        System.out.println("Server said: " + port1.getReservationsByField(Integer.parseInt(args[18])));
	        System.out.println("Server said: " + port1.getUserDetails(Integer.parseInt(args[19])));
	        System.out.println("Server said: " + port1.updateFieldSport(Integer.parseInt(args[20]),Integer.parseInt(args[21]),Double.parseDouble(args[22])));
	        System.out.println("Server said: " + port1.deleteReservations(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.deleteField(Integer.parseInt(args[23])));
	        System.out.println("Server said: " + port1.getEventsHistoryByUser(Integer.parseInt(args[24])));
	        System.out.println("Server said: " + port1.addReservation(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.createEvent(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.createReportType(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.getSports());
	        System.out.println("Server said: " + port1.addFieldSport(Integer.parseInt(args[25]),Integer.parseInt(args[26]),Double.parseDouble(args[27])));
	        System.out.println("Server said: " + port1.deleteManagerEntity(Integer.parseInt(args[28])));
	        System.out.println("Server said: " + port1.getManagerEntitiesById(Integer.parseInt(args[29])));
	        System.out.println("Server said: " + port1.addReservations(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.updateUser(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        SSNWS port2 = service1.getSSNWSPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.deleteReservation(Integer.parseInt(args[30])));
	        System.out.println("Server said: " + port2.createSport(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getUsersByEvent(Integer.parseInt(args[31])));
	        System.out.println("Server said: " + port2.deleteFieldSport(Integer.parseInt(args[32]),Integer.parseInt(args[33])));
	        System.out.println("Server said: " + port2.createManagerEntity(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.registerUser(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getEventById(Integer.parseInt(args[34])));
	        System.out.println("Server said: " + port2.joinEvent(Integer.parseInt(args[35]),Integer.parseInt(args[36])));
	        System.out.println("Server said: " + port2.getEventsByFilters(Integer.parseInt(args[37]),Integer.parseInt(args[38]),Double.parseDouble(args[39]),null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getManagerEntities());
	        System.out.println("Server said: " + port2.getFieldById(Integer.parseInt(args[40])));
	        System.out.println("Server said: " + port2.addField(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.reportUser(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getManagerEntitiesByEvent(Integer.parseInt(args[41])));
	        System.out.println("Server said: " + port2.updateField(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getReportTypes());
	        System.out.println("Server said: " + port2.leaveEvent(Integer.parseInt(args[42]),Integer.parseInt(args[43])));
	        System.out.println("Server said: " + port2.getManagerEntitiesBySport(Integer.parseInt(args[44])));
	        System.out.println("Server said: " + port2.getEventsByUser(Integer.parseInt(args[45])));
	        System.out.println("Server said: " + port2.updateManagerEntity(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getEvents());
	        System.out.println("Server said: " + port2.getSportById(Integer.parseInt(args[46])));
	        System.out.println("Server said: " + port2.getFieldsByManagerEntity(Integer.parseInt(args[47])));
	        System.out.println("Server said: " + port2.getReservationsByField(Integer.parseInt(args[48])));
	        System.out.println("Server said: " + port2.getUserDetails(Integer.parseInt(args[49])));
	        System.out.println("Server said: " + port2.updateFieldSport(Integer.parseInt(args[50]),Integer.parseInt(args[51]),Double.parseDouble(args[52])));
	        System.out.println("Server said: " + port2.deleteReservations(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.deleteField(Integer.parseInt(args[53])));
	        System.out.println("Server said: " + port2.getEventsHistoryByUser(Integer.parseInt(args[54])));
	        System.out.println("Server said: " + port2.addReservation(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.createEvent(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.createReportType(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getSports());
	        System.out.println("Server said: " + port2.addFieldSport(Integer.parseInt(args[55]),Integer.parseInt(args[56]),Double.parseDouble(args[57])));
	        System.out.println("Server said: " + port2.deleteManagerEntity(Integer.parseInt(args[58])));
	        System.out.println("Server said: " + port2.getManagerEntitiesById(Integer.parseInt(args[59])));
	        System.out.println("Server said: " + port2.addReservations(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.updateUser(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
