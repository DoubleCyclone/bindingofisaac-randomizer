import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		new Window().setVisible(true);

	}

	public static class Window extends JFrame implements ActionListener {

		RunObjectives run = new RunObjectives();

		JPanel pnlInfo = new JPanel();
		JPanel pnlButtons = new JPanel();
		JPanel pnlCharacter = new JPanel();
		JPanel pnlObjective = new JPanel();
		JPanel pnlBackup = new JPanel();
		JPanel pnlAltPath = new JPanel();
		JPanel pnlBossRush = new JPanel();
		JPanel pnlHush = new JPanel();
		JPanel pnlDeals = new JPanel();
		JPanel pnlSpeed = new JPanel();

		JLabel lblCharacter = new JLabel("Character");
		JLabel lblObjective = new JLabel("Objective");
		JLabel lblBackup = new JLabel("Backup Objective");
		JLabel lblAltPath = new JLabel("Alt Path");
		JLabel lblBossRush = new JLabel("Boss Rush");
		JLabel lblHush = new JLabel("Hush");
		JLabel lblDeals = new JLabel("Deals");
		JLabel lblSpeed = new JLabel("Speed");
		
		JLabel imgCharacter = new JLabel(new ImageIcon());

		JTextField txtCharacter = new JTextField(run.getCharacter());
		JTextField txtObjective = new JTextField(run.getFinalBoss());
		JTextField txtBackup = new JTextField(run.getBackupObjective());
		JTextField txtAltPath = new JTextField(run.getAltPath());
		JTextField txtBossRush = new JTextField(run.getBossRush());
		JTextField txtHush = new JTextField(run.getHush());
		JTextField txtDeals = new JTextField(run.getDeals());
		JTextField txtSpeed = new JTextField(run.getSpeed());

		JButton btnNotes = new JButton("Notes");
		JButton btnReroll = new JButton("Reroll!");

		public Window() {

			txtCharacter.setEditable(false);
			txtObjective.setEditable(false);
			txtBackup.setEditable(false);
			txtAltPath.setEditable(false);
			txtBossRush.setEditable(false);
			txtHush.setEditable(false);
			txtDeals.setEditable(false);
			txtSpeed.setEditable(false);
			
			characterImageSelect();
			
			pnlCharacter.setLayout(new BorderLayout());
			pnlCharacter.add(txtCharacter,BorderLayout.CENTER);
			pnlCharacter.add(imgCharacter,BorderLayout.EAST);
			pnlObjective.add(lblObjective);
			pnlObjective.add(txtObjective);
			pnlBackup.add(lblBackup);
			pnlBackup.add(txtBackup);
			pnlAltPath.add(lblAltPath);
			pnlAltPath.add(txtAltPath);
			pnlBossRush.add(lblBossRush);
			pnlBossRush.add(txtBossRush);
			pnlHush.add(lblHush);
			pnlHush.add(txtHush);
			pnlDeals.add(lblDeals);
			pnlDeals.add(txtDeals);
			pnlSpeed.add(lblSpeed);
			pnlSpeed.add(txtSpeed);

			setLayout(new BorderLayout());
			pnlInfo.setLayout(new GridLayout(8, 2));

			pnlInfo.add(lblCharacter);
			lblCharacter.setVerticalAlignment(JLabel.CENTER);
			lblCharacter.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(pnlCharacter);
			pnlInfo.add(lblObjective);
			lblObjective.setVerticalAlignment(JLabel.CENTER);
			lblObjective.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtObjective);
			pnlInfo.add(lblBackup);
			lblBackup.setVerticalAlignment(JLabel.CENTER);
			lblBackup.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtBackup);
			pnlInfo.add(lblAltPath);
			lblAltPath.setVerticalAlignment(JLabel.CENTER);
			lblAltPath.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtAltPath);
			pnlInfo.add(lblBossRush);
			lblBossRush.setVerticalAlignment(JLabel.CENTER);
			lblBossRush.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtBossRush);
			pnlInfo.add(lblHush);
			lblHush.setVerticalAlignment(JLabel.CENTER);
			lblHush.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtHush);
			pnlInfo.add(lblDeals);
			lblDeals.setVerticalAlignment(JLabel.CENTER);
			lblDeals.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtDeals);
			pnlInfo.add(lblSpeed);
			lblSpeed.setVerticalAlignment(JLabel.CENTER);
			lblSpeed.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(txtSpeed);

			txtCharacter.setHorizontalAlignment(JLabel.CENTER);
			txtObjective.setHorizontalAlignment(JLabel.CENTER);
			txtBackup.setHorizontalAlignment(JLabel.CENTER);
			txtAltPath.setHorizontalAlignment(JLabel.CENTER);
			txtBossRush.setHorizontalAlignment(JLabel.CENTER);
			txtHush.setHorizontalAlignment(JLabel.CENTER);
			txtDeals.setHorizontalAlignment(JLabel.CENTER);
			txtSpeed.setHorizontalAlignment(JLabel.CENTER);
			
			pnlButtons.add(btnNotes);
			pnlButtons.add(btnReroll);

			btnNotes.addActionListener(this);
			btnReroll.addActionListener(this);

			add(pnlInfo, BorderLayout.CENTER);
			add(pnlButtons, BorderLayout.SOUTH);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(400,400);
			setLocationRelativeTo(null);

		}

		public void characterImageSelect() {
			switch (run.getCharacter()) {
			case "Isaac":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Isaac.png")));
				break;
			case "Magdalene":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Magdalene.png")));
				break;
			case "Cain":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Cain.png")));
				break;
			case "Judas":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Judas.png")));
				break;
			case "Blue Baby":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/BlueBaby.png")));
				break;
			case "Eve":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Eve.png")));
				break;
			case "Samson":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Samson.png")));
				break;
			case "Azazel":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Azazel.png")));
				break;
			case "Lazarus":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Lazarus.png")));
				break;
			case "Eden":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Eden.png")));
				break;
			case "The Lost":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TheLost.png")));
				break;
			case "Lilith":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Lilith.png")));
				break;
			case "Keeper":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Keeper.png")));
				break;
			case "Apollyon":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Apollyon.png")));
				break;
			case "The Forgotten":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TheForgotten.png")));
				break;
			case "Bethany":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/Bethany.png")));
				break;
			case "Jacob & Esau":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/JacobAndEsau.png")));
				break;
			case "Tainted Isaac":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedIsaac.png")));
				break;
			case "Tainted Magdalene":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedMagdalene.png")));
				break;
			case "Tainted Cain":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedCain.png")));
				break;
			case "Tainted Judas":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedJudas.png")));
				break;
			case "Tainted Blue Baby":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedBlueBaby.png")));
				break;
			case "Tainted Eve":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedEve.png")));
				break;
			case "Tainted Samson":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedSamson.png")));
				break;
			case "Tainted Azazel":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedAzazel.png")));
				break;
			case "Tainted Lazarus":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedLazarus.png")));
				break;
			case "Tainted Eden":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedEden.png")));
				break;
			case "Tainted Lost":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedLost.png")));
				break;
			case "Tainted Lilith":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedLilith.png")));
				break;
			case "Tainted Keeper":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedKeeper.png")));
				break;
			case "Tainted Apollyon":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedApollyon.png")));
				break;
			case "Tainted Forgotten":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedForgotten.png")));
				break;
			case "Tainted Bethany":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedBethany.png")));
				break;
			case "Tainted Jacob":
				imgCharacter.setIcon(new ImageIcon(this.getClass().getResource("images/TaintedJacob.png")));
				break;
			default:
				imgCharacter.setIcon(new ImageIcon());
				break;
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btnNotes)) {
				new NotesWindow(new JTextArea(run.getNotes())).setVisible(true);
			} else if (e.getSource().equals(btnReroll)) {
				run = new RunObjectives();
				txtCharacter.setText(run.getCharacter());
				txtObjective.setText(run.getFinalBoss());
				txtBackup.setText(run.getBackupObjective());
				txtAltPath.setText(run.getAltPath());
				txtBossRush.setText(run.getBossRush());
				txtHush.setText(run.getHush());
				txtDeals.setText(run.getDeals());
				txtSpeed.setText(run.getSpeed());
				characterImageSelect();
			}

		}

	}

	public static class NotesWindow extends JFrame {

		public NotesWindow(JTextArea a) {

			add(a);
			a.setEditable(false);

			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			pack();
			setLocationRelativeTo(null);
		}

	}
}
