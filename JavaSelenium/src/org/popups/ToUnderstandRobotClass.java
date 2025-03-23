package org.popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ToUnderstandRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ALT);
	}

}
