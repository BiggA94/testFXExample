package application;

import javafx.stage.Stage;

import org.junit.*;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import org.junit.Test;
import org.testfx.matcher.base.NodeMatchers;

import application.Main;
import static org.testfx.api.FxAssert.verifyThat;

public class testApplication extends ApplicationTest {

	@Before
	public void before() throws Exception {
		FxToolkit.registerPrimaryStage();
		FxToolkit.setupApplication(Main.class);
	}

	public testApplication() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
	}

	@Test
	public void testInit() {
		verifyThat("#textField", NodeMatchers.hasText(""));
	}

	@Test
	public void testButton() {
		clickOn("#button2");
		clickOn("#button");

		verifyThat("#textField", NodeMatchers.hasText("Button clicked"));
	}
	
	@Test
	public void testButton2() {
		clickOn("#button2");
		verifyThat("#textField", NodeMatchers.hasText(""));
	}
	
	@Test
	public void bla(){
		clickOn("#button2");
		clickOn("#button");
		
		clickOn("Button clicked");
		
		clickOn("Label");
		
	}

}
