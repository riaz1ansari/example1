package com.riaz;

import java.io.File;
import java.sql.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.Resource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.riaz.service.Vehicle;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/spring/main-context.xml"})
public class TestSpringComponent {

	@Resource 
	@Qualifier("bus")
	private Vehicle vehicle;
	//private Vehicle car;
	
	@Value("${app.is.stopped}")
	String isStopped="false";

	
	@BeforeClass
	public static void init(){
		System.setProperty("prop_path", "/home/riaz/Project/props/camel.app/");
		
		/*TimerTask task = new FileWatcher(new File(System.getProperty(""))){
		    @Override
		    protected void onChange(File file) {
		        loadServiceProperties(file);
		        loadMetadata();
		    }
		};
		
		Timer timer = new Timer();
		timer.schedule(task, new Date(), Long.valueOf(properties.getProperty("properties.file.timer.schedule"))); 
		// repeat the check every second
*/
	}
	 
	@Test
	public void print(){
		vehicle.move();
		System.out.println("test ...");
		
		while (!Boolean.valueOf(isStopped)){
			
			System.out.println("Running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



