package com.cognizant.ngtmobtest.appLaunch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cognizant.ngtmobtest.Main;

public class App {

	private JFrame frame;
	private Toolkit toolkit;
	private Dimension size;
	private JMenu menuDevice;
	private JMenuItem menuItemAndroidDevice;
	private JPanel deviceConfigurePanel;
	private JPanel buidConfigurePanel;
	private JButton btnInstallBuild;
	private JButton btnInstrumentBuild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		toolkit = frame.getToolkit();
		size = toolkit.getScreenSize();
		frame.setTitle("MobTesT");
		frame.getContentPane().setBackground(new Color(32, 178, 170));

		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(new Color(0, 0, 139));
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.X_AXIS));
		frame.getContentPane().add(menuPanel, BorderLayout.NORTH);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		menuPanel.add(menuBar);
		menuDevice = new JMenu("Devices");
		menuDevice.setBackground(new Color(152, 251, 152));
		menuDevice.setMnemonic('D');
		menuDevice.setToolTipText("Click to set devices");
		menuBar.add(menuDevice, BorderLayout.WEST);
		menuItemAndroidDevice = new JMenuItem("Android Device");
		menuItemAndroidDevice
				.setIcon(new ImageIcon(
						App.class
								.getResource("/com/cognizant/ngtmobtest/appLaunch/android.png")));
		menuDevice.add(menuItemAndroidDevice);

		menuItemAndroidDevice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main start = new Main();
				start.main(null);
			}
		});

		deviceConfigurePanel = new JPanel();
		deviceConfigurePanel.setBackground(new Color(46, 139, 87));
		frame.getContentPane().add(deviceConfigurePanel, BorderLayout.WEST);
		deviceConfigurePanel.setLayout(new BoxLayout(deviceConfigurePanel,
				BoxLayout.Y_AXIS));

		buidConfigurePanel = new JPanel();
		deviceConfigurePanel.add(buidConfigurePanel);
		buidConfigurePanel.setLayout(new BoxLayout(buidConfigurePanel,
				BoxLayout.X_AXIS));

		btnInstallBuild = new JButton("Install");
		btnInstallBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInstallBuild.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnInstallBuild.setToolTipText("Install new build");
		btnInstallBuild
				.setIcon(new ImageIcon(
						App.class
								.getResource("/com/cognizant/ngtmobtest/appLaunch/install.png")));

		buidConfigurePanel.add(btnInstallBuild);
		btnInstrumentBuild = new JButton("Instrument");
		btnInstrumentBuild
				.setIcon(new ImageIcon(
						App.class
								.getResource("/com/cognizant/ngtmobtest/appLaunch/instrument.png")));
		btnInstrumentBuild.setBorder(new EmptyBorder(0, 0, 0, 0));
		buidConfigurePanel.add(btnInstrumentBuild);

		frame.setBounds(100, 100, 450, 300);
		frame.setLocation(size.width / 2 - frame.getWidth() / 2, size.height
				/ 2 - frame.getHeight() / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * class LogStreamReader implements Runnable {
	 * 
	 * private BufferedReader reader;
	 * 
	 * public LogStreamReader(InputStream is) { this.reader = new
	 * BufferedReader(new InputStreamReader(is)); }
	 * 
	 * public void run() { try { String line = reader.readLine(); while (line !=
	 * null) { System.out.println(line); line = reader.readLine(); }
	 * reader.close(); } catch (IOException e) { e.printStackTrace(); } } }
	 */

	/*
	 * private static class IOThreadHandler extends Thread { private InputStream
	 * inputStream; private StringBuilder output = new StringBuilder();
	 * 
	 * IOThreadHandler(InputStream inputStream) { this.inputStream =
	 * inputStream; }
	 * 
	 * public void run() { Scanner br = null; try { br = new Scanner(new
	 * InputStreamReader(inputStream)); String line = null; while
	 * (br.hasNextLine()) { line = br.nextLine(); output.append(line +
	 * System.getProperty("line.separator")); } } finally { br.close(); } }
	 * 
	 * public StringBuilder getOutput() { return output; } }
	 */
}
