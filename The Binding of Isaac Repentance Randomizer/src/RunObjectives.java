import java.util.Random;

public class RunObjectives {

	private static String[] characters = new String[] { "Isaac", "Magdalene", "Cain", "Judas", "Blue Baby", "Eve",
			"Samson", "Azazel", "Lazarus", "Eden", "The Lost", "Lilith", "Keeper", "Apollyon", "The Forgotten",
			"Bethany", "Jacob & Esau", "Tainted Isaac", "Tainted Magdalene", "Tainted Cain", "Tainted Judas",
			"Tainted Blue Baby", "Tainted Eve", "Tainted Samson", "Tainted Azazel", "Tainted Lazarus", "Tainted Eden",
			"Tainted Lost", "Tainted Lilith", "Tainted Keeper", "Tainted Apollyon", "Tainted Forgotten",
			"Tainted Bethany", "Tainted Jacob" };
	private static String[] finalBosses = new String[] { "Blue Baby", "The Lamb", "Mega Satan", "Delirium", "Mother",
			"The Beast" };
	private static Random random = new Random();

	private String character;
	private String finalBoss;
	private String backupObjective;
	private String altPath;
	private String bossRush;
	private String hush;
	private String deals;
	private String speed;
	private String notes;

	public RunObjectives() {
		this.character = characters[random.nextInt(characters.length)];
		this.finalBoss = finalBosses[random.nextInt(finalBosses.length)];
		this.backupObjective = "None";
		this.altPath = random.nextInt(2) == 1 ? "Yes" : "No";
		this.bossRush = random.nextInt(2) == 1 ? "Yes" : "No";
		this.hush = random.nextInt(2) == 1 ? "Yes" : "No";
		this.deals = random.nextInt(2) == 1 ? "Angel" : "Devil";
		this.speed = random.nextInt(2) == 1 ? "Fast" : "Slow";
		this.notes = "Taking Angel Items are okay if you are expected to take Devil Deals; vice versa is not.\nIf Boss Rush, Hush or Alt Paths are not doable, don't do them.";

		if (finalBoss.equals("Mega Satan")) {
			backupObjective = random.nextInt(2) == 1 ? finalBosses[0] : finalBosses[1];
			notes += "\nYou can start taking Devil Deals after completing the key if the specified deals are from Devils.";
		} else if (finalBoss.equals("Delirium")) {
			backupObjective = random.nextInt(2) == 1 ? finalBosses[0] : finalBosses[1];
			hush = "Yes";
			speed = "Fast";
			notes += "\nIf Hush is not doable, go through the backup objective instead.";
		} else if (finalBoss.equals("Mother")) {
			backupObjective = random.nextInt(2) == 1 ? finalBosses[0] : finalBosses[1];
			altPath = "Yes";
			hush = "No";
			notes += "\nIf Alt Paths are not doable, go through the backup objective instead.";
		} else if (finalBoss.equals("The Beast")) {
			hush = "No";
			notes += "\nDon't forget to find a way to teleport before the Mom Fight.";
		}
		notes += speed.equals("Fast") ? "\nGo to the item rooms and the bosses as fast as possible."
				: "\nGo to every room possible.";

		System.out.println(character);
		System.out.println(finalBoss);
		System.out.println(backupObjective);
		System.out.println(altPath);
		System.out.println(bossRush);
		System.out.println(hush);
		System.out.println(deals);
		System.out.println(speed);
		System.out.println(notes);
	}

	public String getCharacter() {
		return character;
	}

	public String getFinalBoss() {
		return finalBoss;
	}

	public String getBackupObjective() {
		return backupObjective;
	}

	public String getAltPath() {
		return altPath;
	}

	public String getBossRush() {
		return bossRush;
	}

	public String getHush() {
		return hush;
	}

	public String getDeals() {
		return deals;
	}

	public String getSpeed() {
		return speed;
	}

	public String getNotes() {
		return notes;
	}

}
