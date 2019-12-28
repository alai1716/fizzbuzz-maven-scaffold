import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void should_land_the_rover_on_area() throws Exception {
		Area area = new Area(10, 10);
		Rover rover = new Rover();
		rover.land(area, 5, 5, Rover.EAST);
		String position = rover.getPosition();
		assertThat(position).isEqualTo("55E");
	}
	
	@Test
	public void should_move_forward() throws Exception {
		Area area = new Area(10, 10);
		Rover rover = new Rover();
		rover.land(area, 5, 5, "E");
		rover.move();
		String position = rover.getPosition();
		assertThat(position).isEqualTo("65E");
	}
	
	@Test
	public void name() throws Exception {
		Rover rover = new Rover();
		RoverController roverController = new RoverController(rover);
		String mission = "10,10,5,5,E,M,L,M,R";
		String position = roverController.execute(mission);
		assertThat(position).isEqualTo("66E");
	}
	
	@Test
	public void should_warning_when_land_out_of_area() throws Exception {
		expectedException.expect(Exception.class);
		expectedException.expectMessage("x=20 is out of area");
		
		Rover rover = new Rover();
		RoverController roverController = new RoverController(rover);
		String mission = "10,10,20,20,E,M,L,M,R";
		roverController.execute(mission);
	}
	
	@Test
	public void should_warning_when_move_out_of_area() throws Exception {
		expectedException.expect(Exception.class);
		expectedException.expectMessage("不能移动到区域外");
		
		Rover rover = new Rover();
		RoverController roverController = new RoverController(rover);
		String mission = "10,10,9,9,E,M,M,M,M";
		roverController.execute(mission);
	}
}