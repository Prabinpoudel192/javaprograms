import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EnterKeyListener implements KeyListener {

    public static void main(String[] args) {
        // Create an instance of the class
        EnterKeyListener enterKeyListener = new EnterKeyListener();

        // Register the listener to the component where you want to detect the Enter key press
        SomeComponent.addKeyListener(enterKeyListener);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is not used in this example, but it must be implemented
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Check if the Enter key is pressed (key code 10)
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            // Perform your desired action here
            System.out.println("Enter key pressed!");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is not used in this example, but it must be implemented
    }
}
