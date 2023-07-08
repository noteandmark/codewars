package tasks_6_level.task33_versionsmanager;

public class VersionManager {
	int major;
	int minor;
	int patch;
	String initialVersion;

	public VersionManager() {
		this("");
	}

	public VersionManager(String initialVersion) {
		if (initialVersion == null || initialVersion.isEmpty()) {
			initialVersion = "0.0.1";
		}
		parseVersion(initialVersion);
	}

	public void parseVersion(String version) {
		String[] parts = version.split("\\.");
		try {
			major = Integer.parseInt(parts[0]);
			minor = Integer.parseInt(parts[1]);
			patch = Integer.parseInt(parts[2]);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Error occurred while parsing version!");
		}
	}

	public VersionManager major() {
		// increase MAJOR by 1, set MINOR and PATCH to 0
		this.major++;
		this.minor = 0;
		this.patch = 0;
		return this; // Return the instance of VersionManager
	}

	public VersionManager minor() {
		// increase MINOR by 1, set PATCH to 0
		this.minor++;
		this.patch = 0;
		return this;
	}

	public VersionManager patch() {
		// increase PATCH by 1
		this.patch++;
		return this;
	}

	public VersionManager rollback() {
		/*
		 * return the MAJOR, MINOR, and PATCH to their values before the previous
		 * major/minor/patch call, or throw an exception with the message
		 * "Cannot rollback!" if there's no version to roll back to. Multiple calls to
		 * rollback() should be possible and restore the version history release() -
		 * return a string in the format "{MAJOR}.{MINOR}.{PATCH}"
		 */
		try {

		} catch (Exception e) {
			throw new IllegalArgumentException("Cannot rollback!");
		}

		return this;
	}

	public String release() {
		// return a string in the format "{MAJOR}.{MINOR}.{PATCH}
		return major + "." + minor + "." + patch;
	}

}
