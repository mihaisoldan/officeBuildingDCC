package officeBuildingDCC;

import building.BuildingStructure;
import building.Floor;
import building.Room;
import repast.simphony.dataLoader.ContextBuilder;

public class OfficeBuildingDCC implements ContextBuilder<Object> {
	
	//BuildingStructure buildingStrucure;
	
	
	
	public BuildingStructure createBuildingStructure(){
		Floor floor1 = new Floor(0);
		floor1.addRoom(new Room("stairs",0,0,7,12,7,2));
		floor1.addRoom(new Room("elevator",0,12,7,16,7,13));
		floor1.addRoom(new Room("printers",0,16,7,27,7,21));
		floor1.addRoom(new Room("accounting",0,34,12,50,3,34));
		floor1.addRoom(new Room("accounting",0,34,12,50,3,34));
		floor1.addRoom(new Room("commercial",12,34,24,50,18,34));
		floor1.addRoom(new Room("relax",33,43,50,50,33,46));
		floor1.addRoom(new Room("menBathroom",33,34,41,43,37,34));
		floor1.addRoom(new Room("womenBathroom",41,34,50,43,46,34));
		floor1.addRoom(new Room("callCenter",14,22,50,27,23,27));
		floor1.addRoom(new Room("menBathroom",33,34,41,43,37,34));
		floor1.addRoom(new Room("nationalExpeditions",14,0,32,15,22,15));
		floor1.addRoom(new Room("internationalExpeditions",32,0,50,15,42,15));
		
		Floor floor2 = new Floor(floor1,50,1);
		
		Floor floor3 = new Floor(2);
		floor3.addRoom(new Room("stairs",0,0,7,12,7,2));
		floor3.addRoom(new Room("elevator",0,12,7,16,7,13));
		floor3.addRoom(new Room("bar",0,16,7,26,7,19));
		floor3.addRoom(new Room("conferenceRoom",0,33,19,50,13,33));
		floor3.addRoom(new Room("menBathroom",26,41,34,50,29,41));
		floor3.addRoom(new Room("womenBathroom",34,41,42,50,37,41));
		floor3.addRoom(new Room("briefing",42,32,50,50,47,32));
		floor3.addRoom(new Room("boss",34,0,50,25,40,25));
		floor3.addRoom(new Room("vice1",15,0,34,12,15,6));
		floor3.addRoom(new Room("vice2",15,12,34,25,15,21));
		
		BuildingStructure building = new BuildingStructure(3);
		building.addFloor(floor1);
		building.addFloor(floor2);
		building.addFloor(floor3);
		
		return building;
		

	}

}
